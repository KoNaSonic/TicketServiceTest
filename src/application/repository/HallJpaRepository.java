package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.HallEntity;

public interface HallJpaRepository extends JpaRepository<HallEntity, Integer>{

}
