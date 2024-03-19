package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
