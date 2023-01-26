package kg.mega.cinematica.models.dto;
//
//import kg.mega.cinematica.models.entities.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDto {
    @JsonIgnore
    Long id;
    int price;
    LocalTime startTime;
    //    UserDto userId;
    @JsonIgnore
    boolean active;
    Date addDate;
    Date updateDate;
}
