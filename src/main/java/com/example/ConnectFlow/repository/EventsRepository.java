package com.example.ConnectFlow.repository;

import com.example.ConnectFlow.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventsRepository extends JpaRepository<Events, UUID> {
}
