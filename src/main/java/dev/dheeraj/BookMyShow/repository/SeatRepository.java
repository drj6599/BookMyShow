package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Integer> {
}
