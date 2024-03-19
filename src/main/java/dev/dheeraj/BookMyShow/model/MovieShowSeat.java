package dev.dheeraj.BookMyShow.model;

import dev.dheeraj.BookMyShow.model.constant.MovieShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MovieShowSeat extends BaseModel {
    private int price;
    @ManyToOne
    private MovieShow movieShow;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private MovieShowSeatStatus movieShowSeatStatus;
}