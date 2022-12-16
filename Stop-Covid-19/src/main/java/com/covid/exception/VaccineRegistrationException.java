package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class VaccineRegistrationException extends RuntimeException{

	public VaccineRegistrationException() {
		// TODO Auto-generated constructor stub
	}
	
	public VaccineRegistrationException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
