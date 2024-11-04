package com.example.sportsevent.dto;

import com.example.sportsevent.enumerated.Position;

public class PlayerDto {
	private Long id;
	private String name;
	private int age;
	private String email;
	private Long teamId;
	private Position position;
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
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

	
	
	
	public PlayerDto(Long id, String name, int age, String email, Long teamId, Position position) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.teamId = teamId;
		this.position = position;
	}
	public PlayerDto() {
		super();
	}
	
	
	
	

}
