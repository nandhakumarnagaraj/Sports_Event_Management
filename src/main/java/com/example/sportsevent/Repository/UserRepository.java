package com.example.sportsevent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sportsevent.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
