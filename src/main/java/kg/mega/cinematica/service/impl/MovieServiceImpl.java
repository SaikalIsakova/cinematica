package kg.mega.cinematica.service.impl;

import kg.mega.cinematica.dao.MovieRep;
import kg.mega.cinematica.mappers.MovieMapper;
import kg.mega.cinematica.models.dto.MovieDto;
import kg.mega.cinematica.models.request.SaveMovieRequest;
import kg.mega.cinematica.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    MovieMapper mapper = MovieMapper.INSTANCE;

    private final MovieRep rep;

    public MovieServiceImpl(MovieRep rep) {
        this.rep = rep;
    }

    @Override
    public MovieDto save(MovieDto movieDto) {
        return mapper.toDto(rep.save(mapper.toEntity(movieDto)));
    }

    @Override
    public MovieDto create(SaveMovieRequest movie) {
        MovieDto movieDto = new MovieDto();
        movieDto.setName(movie.getName());
        movieDto.setDefinition(movie.getDefinition());
        movieDto.setRating(movie.getRating());
        movieDto.setPg(movie.getPg());
        movieDto.setImage(movie.getImage());
        movieDto.setAddDate(new Date());
        movieDto.setUpdateDate(new Date());

        return save(movieDto);
    }

    @Override
    public MovieDto findById(Long id) {
        return mapper.toDto(rep.findById(id).orElseThrow(() -> new RuntimeException("Movie not found!")));
    }

    @Override
    public MovieDto delete(Long id) {
        MovieDto movieDto = findById(id);
        movieDto.setActive(false);
        return save(movieDto);
    }

    @Override
    public List<MovieDto> findAll() {
        return mapper.toDtos(rep.findAll());
    }
}
