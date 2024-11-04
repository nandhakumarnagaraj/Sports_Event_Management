package com.example.sportsevent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sportsevent.entity.Tournament;
import com.example.sportsevent.service.TournamentService;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

	@Autowired
	private TournamentService tournamentService;

	@GetMapping
	public List<Tournament> getAllTournaments() {
		return tournamentService.getAllTournaments();
	}

	@GetMapping("/{id}")
	public Tournament getTournamentById(@PathVariable Long id) {
		return tournamentService.getTournamentById(id);
	}

	@PostMapping
	public Tournament createTournament(@RequestBody Tournament tournament) {
		return tournamentService.createTournament(tournament);
	}

	@PutMapping("/{id}")
	public Tournament updateTournament(@PathVariable Long id, @RequestBody Tournament tournamentDetails) {
		return tournamentService.updateTournament(id, tournamentDetails);
	}

	@DeleteMapping("/{id}")
	public void deleteTournament(@PathVariable Long id) {
		tournamentService.deleteTournament(id);
	}
}
