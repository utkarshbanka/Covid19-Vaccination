package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class VaccineException extends RuntimeException{

	public VaccineException() {
		// TODO Auto-generated constructor stub
	}
	
	public VaccineException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
