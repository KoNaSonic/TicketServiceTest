package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, String>{

}
