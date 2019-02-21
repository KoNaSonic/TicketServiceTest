package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.Hall;

public interface HallRepo extends JpaRepository<Hall, Long>{

}
