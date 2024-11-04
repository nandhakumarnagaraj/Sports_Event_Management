package com.example.sportsevent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sportsevent.Repository.MatchRepository;
import com.example.sportsevent.entity.Match;


@Service
public class MatchService {

	@Autowired
	private MatchRepository matchRepository;

	public List<Match> getAllMatches() {
		return matchRepository.findAll();
	}

	public Match getMatchById(Long id) {
		return matchRepository.findById(id).orElse(null);
	}

	public Match createMatch(Match match) {
		return matchRepository.save(match);
	}

	public Match updateMatch(Long id, Match matchDetails) {
		Match match = matchRepository.findById(id).orElse(null);
		if (match != null) {
			match.setTeam1(matchDetails.getTeam1());
			match.setTeam2(matchDetails.getTeam2());
			match.setTournament(matchDetails.getTournament());
			match.setDate(matchDetails.getDate());
			match.setVenue(matchDetails.getVenue());
			match.setScore1(matchDetails.getScore1());
			match.setScore2(matchDetails.getScore2());
			match.setStatus(matchDetails.getStatus());
			return matchRepository.save(match);
		}
		return null;
	}

	public void deleteMatch(Long id) {
		matchRepository.deleteById(id);
	}
}
