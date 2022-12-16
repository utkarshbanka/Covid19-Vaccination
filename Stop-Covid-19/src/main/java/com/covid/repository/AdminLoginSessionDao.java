package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.CurrentAdminSession;

public interface AdminLoginSessionDao extends JpaRepository<CurrentAdminSession, Integer> {

	
	
	
	
}
