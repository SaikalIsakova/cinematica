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
public class CinemaDto{
    @JsonIgnore
    Long id;
    String name;
    String address;
    String logo;
    @JsonIgnore
    boolean active;
    Date addDate;
    Date updateDate;






}
