package com.example.estudiantesValidacion.repository;

import com.example.estudiantesValidacion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
