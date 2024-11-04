package com.example.sportsevent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sportsevent.entity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

}
