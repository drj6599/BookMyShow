package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
