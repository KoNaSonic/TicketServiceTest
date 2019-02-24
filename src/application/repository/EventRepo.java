package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.Event;

public interface EventRepo extends JpaRepository<Event, Long>{

}
