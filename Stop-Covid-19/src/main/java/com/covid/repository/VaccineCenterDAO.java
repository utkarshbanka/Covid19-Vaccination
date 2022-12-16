package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.Member;
import com.covid.model.VaccinationCenter;

@Repository
public interface VaccineCenterDAO extends JpaRepository<VaccinationCenter, Integer>{
	
	
	

}
