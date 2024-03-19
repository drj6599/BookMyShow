package dev.dheeraj.BookMyShow.repository;

import dev.dheeraj.BookMyShow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
