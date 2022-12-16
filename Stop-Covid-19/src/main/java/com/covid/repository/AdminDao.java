package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Admin;

public interface AdminDao  extends JpaRepository<Admin, Integer>{

	
	
}
