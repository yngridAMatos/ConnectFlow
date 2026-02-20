package com.example.ConnectFlow.repository;

import com.example.ConnectFlow.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {
}
