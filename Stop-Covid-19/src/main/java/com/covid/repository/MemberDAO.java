package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.Member;

@Repository
public interface MemberDAO  extends JpaRepository<Member, Integer>{

	
	// Incomplete
	
	
}
