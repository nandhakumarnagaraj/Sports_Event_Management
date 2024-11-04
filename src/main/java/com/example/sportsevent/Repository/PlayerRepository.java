package com.example.sportsevent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sportsevent.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
