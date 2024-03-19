package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
