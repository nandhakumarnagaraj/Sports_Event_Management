package com.example.sportsevent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sportsevent.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
