package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
