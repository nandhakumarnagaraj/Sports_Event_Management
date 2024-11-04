package com.example.sportsevent.entity;

import java.sql.Timestamp;

import com.example.sportsevent.enumerated.Status;

import jakarta.persistence.*;

@Entity
@Table(name = "tblmatch")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team1id")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2id")
    private Team team2;

    @ManyToOne
    @JoinColumn(name = "tournamentid")
    private Tournament tournament;

    private Timestamp date;
    private String venue;
    private int score1;
    private int score2;

    @Enumerated(EnumType.STRING)
    private Status status; // ENUM: SCHEDULED, COMPLETED, CANCELLED

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

	public Match() {
		super();
	}

	public Match(Team team1, Team team2, Tournament tournament, Timestamp date, String venue, int score1, int score2,
			Status status) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.tournament = tournament;
		this.date = date;
		this.venue = venue;
		this.score1 = score1;
		this.score2 = score2;
		this.status = status;
	}
    
}

