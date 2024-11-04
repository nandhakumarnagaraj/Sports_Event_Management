package com.example.sportsevent.entity;

import com.example.sportsevent.enumerated.Position;

import jakarta.persistence.*;

@Entity
@Table(name = "tblplayer")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String email;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamid")
	private Team team;

	@Enumerated(EnumType.STRING)
	private Position position; // ENUM: Batsman, Bowler, All-rounder

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Player() {
		super();
	}

	public Player(String name, int age, String email, Team team, Position position) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.team = team;
		this.position = position;
	}

}
