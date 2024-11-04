package com.example.sportsevent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sportsevent.Repository.PlayerRepository;
import com.example.sportsevent.dto.PlayerDto;
import com.example.sportsevent.entity.Player;
import com.example.sportsevent.entity.Team;
import com.example.sportsevent.enumerated.Position;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    
    @Autowired
    TeamService teamService;

    public List<PlayerDto> getAllPlayers() {
    	List<Player> players =  playerRepository.findAll();
        List<PlayerDto> playerDtos = players.stream().map((p)->new PlayerDto(p.getId(), p.getName(), p.getAge(), p.getEmail(), p.getTeam().getId(), p.getPosition())).toList();
        
        
        return playerDtos;
        
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public PlayerDto createPlayer(PlayerDto playerDto) {
    	
    	Player player = new Player();
    	
    	player.setName(playerDto.getName());
    	player.setEmail(playerDto.getEmail());
    	player.setPosition(playerDto.getPosition());
    	player.setAge(playerDto.getAge());
    	Team team = teamService.getTeamById(playerDto.getTeamId());
    	player.setTeam(team);
        Player savedPlayer= playerRepository.save(player);
        
        playerDto.setId(savedPlayer.getId());
        return playerDto;
        
    }

    public Player updatePlayer(Long id, Player playerDetails) {
        Player player = playerRepository.findById(id).orElse(null);
        if (player != null) {
            player.setName(playerDetails.getName());
            player.setAge(playerDetails.getAge());
            player.setEmail(playerDetails.getEmail());
            player.setTeam(playerDetails.getTeam());
            player.setPosition(playerDetails.getPosition());
            return playerRepository.save(player);
        }
        return null;
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}

