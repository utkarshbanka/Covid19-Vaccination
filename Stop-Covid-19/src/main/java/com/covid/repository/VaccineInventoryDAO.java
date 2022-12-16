package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.VaccineInventory;

@Repository
public interface VaccineInventoryDAO  extends JpaRepository<VaccineInventory, Integer>{

	
	
}
