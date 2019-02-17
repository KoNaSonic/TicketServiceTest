package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.EventEntity;

public interface EventJpaRepository extends JpaRepository<EventEntity, Integer>{

}
