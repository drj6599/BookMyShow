package dev.dheeraj.BookMyShow.model;

import dev.dheeraj.BookMyShow.model.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<MovieShowSeat> movieShowSeats;
    @ManyToOne
    private MovieShow movieShow;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}