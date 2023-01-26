package kg.mega.cinematica.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.mega.cinematica.enums.SeatStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SeatScheduleDto{
    @JsonIgnore
    Long id;
    SeatDto seat;
    RoomMovieDto roomMovie;
    SeatStatus seatStatus;
    @JsonIgnore
    boolean active;
    Date addDate;
    Date updateDate;
}
