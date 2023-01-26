package kg.mega.cinematica.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SeatDto{
    @JsonIgnore
    Long id;
    int number;
    RoomDto room;
    int row;
    @JsonIgnore
    boolean active;
    Date addDate;
    Date updateDate;
}
