package kg.mega.cinematica.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_movie")
public class Movie{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String definition;
    String name;
    Double rating;
    String pg;
    boolean active;
    String image;
    Date addDate;
    Date updateDate;


}
