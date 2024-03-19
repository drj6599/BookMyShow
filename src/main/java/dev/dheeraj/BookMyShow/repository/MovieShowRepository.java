package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieShowRepository extends JpaRepository<MovieShow,Integer> {
}
