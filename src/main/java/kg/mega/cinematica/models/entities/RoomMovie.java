package kg.mega.cinematica.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_room_movie")
public class RoomMovie{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Room room;
    @ManyToOne
    Movie movie;
    @ManyToOne
    Schedule schedule;
    @ManyToOne
    Price price;
    boolean active;
    Date addDate;
    Date updateDate;




}
