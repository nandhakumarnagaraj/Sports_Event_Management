package com.example.sportsevent.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tblteam")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String coach;

	@OneToOne
	@JoinColumn(name = "captainid")
	private Player captain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public Player getCaptain() {
		return captain;
	}

	public void setCaptain(Player captain) {
		this.captain = captain;
	}

	public Team() {
		super();
	}

	public Team(String name, String coach, Player captain) {
		super();
		this.name = name;
		this.coach = coach;
		this.captain = captain;
	}
	
}
