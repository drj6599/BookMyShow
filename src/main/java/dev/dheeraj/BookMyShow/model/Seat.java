package dev.dheeraj.BookMyShow.model;

import dev.dheeraj.BookMyShow.model.constant.SeatStatus;
import dev.dheeraj.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int seatRow;
    private int seatCol;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus status;
}