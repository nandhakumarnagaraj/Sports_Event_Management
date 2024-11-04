package com.example.sportsevent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sportsevent.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {

}
