package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.Price;

public interface PriceRepo extends JpaRepository<Price, Long>{

}
