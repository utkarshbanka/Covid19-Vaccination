package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class MemberException extends RuntimeException{

	public MemberException() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
