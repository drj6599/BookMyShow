package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.MovieShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieShowSeatRepository extends JpaRepository<MovieShowSeat,Integer> {
}
