package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class AppointmentException extends RuntimeException{

	public AppointmentException() {
		// TODO Auto-generated constructor stub
	}
	
	public AppointmentException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
