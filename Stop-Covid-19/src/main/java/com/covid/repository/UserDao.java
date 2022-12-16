package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

	
	
}
