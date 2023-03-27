package com.example.estudiantesvalidacion.repository;

import com.example.estudiantesvalidacion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
