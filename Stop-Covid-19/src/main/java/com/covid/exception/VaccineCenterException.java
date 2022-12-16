package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class VaccineCenterException extends RuntimeException{

	public VaccineCenterException() {
		// TODO Auto-generated constructor stub
	}
	
	public VaccineCenterException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
