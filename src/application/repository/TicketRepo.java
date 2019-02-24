package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Long>{

}
