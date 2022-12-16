package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.CurrentUserSession;

public interface UserSessionDao extends JpaRepository<CurrentUserSession, Integer> {

}