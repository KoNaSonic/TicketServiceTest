package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.TicketEntity;

public interface TicketJpaRepository extends JpaRepository<TicketEntity, Integer>{

}
