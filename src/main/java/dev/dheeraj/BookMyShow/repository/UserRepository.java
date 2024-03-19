package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
