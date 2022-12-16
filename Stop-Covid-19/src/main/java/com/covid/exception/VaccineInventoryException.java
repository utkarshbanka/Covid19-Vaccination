package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class VaccineInventoryException extends RuntimeException{

	public VaccineInventoryException() {
		// TODO Auto-generated constructor stub
	}
	
	public VaccineInventoryException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
