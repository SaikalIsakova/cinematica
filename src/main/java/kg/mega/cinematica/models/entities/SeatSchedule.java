package kg.mega.cinematica.models.entities;

import kg.mega.cinematica.enums.SeatStatus;
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
@Table(name = "tb_seat_schedule")
public class SeatSchedule{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Seat seat;
    @ManyToOne
    RoomMovie roomMovie;
    @Enumerated(EnumType.STRING)
    SeatStatus seatStatus;
    boolean active;
    Date addDate;
    Date updateDate;








}
