package com.example.ConnectFlow.repository;

import com.example.ConnectFlow.model.EventParticipants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventParticipantsRepository extends JpaRepository<EventParticipants, UUID> {
}
