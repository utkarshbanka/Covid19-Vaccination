package com.covid.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
	
	//Member Exceptions
	@ExceptionHandler(MemberException.class)
	public ResponseEntity<ExceptionError> memberException(MemberException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Vaccine Center Exceptions
	@ExceptionHandler(VaccineCenterException.class)
	public ResponseEntity<ExceptionError> vaccineCenterException(VaccineCenterException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Vaccine Exception
	@ExceptionHandler(VaccineException.class)
	public ResponseEntity<ExceptionError> vaccineException(VaccineException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Id Card Exception
	@ExceptionHandler(IdCardException.class)
	public ResponseEntity<ExceptionError> vaccineException(IdCardException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Vaccine Registration Exception
	@ExceptionHandler(VaccineRegistrationException.class)
	public ResponseEntity<ExceptionError> vaccineRegistrationException(VaccineRegistrationException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	//Vaccine Inventory Exception
	@ExceptionHandler(VaccineInventoryException.class)
	public ResponseEntity<ExceptionError> vaccineInventoryException(VaccineInventoryException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Appointment Exception
	@ExceptionHandler(AppointmentException.class)
	public ResponseEntity<ExceptionError> AppointmentException(AppointmentException e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Other Exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionError> anyException(Exception e,WebRequest wbr){
		ExceptionError err = new ExceptionError(LocalDateTime.now(), e.getMessage(),wbr.getDescription(false));
		return new ResponseEntity<ExceptionError>(err, HttpStatus.BAD_REQUEST);
	}

	//URL Exceptions
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExceptionError> urlNotFound(NoHandlerFoundException e,WebRequest wrq){
		ExceptionError err=new ExceptionError(LocalDateTime.now(),e.getMessage(),wrq.getDescription(false));
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	//Invalid Data provide Exceptions
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionError> invalidData(MethodArgumentNotValidException e){
		ExceptionError err=new ExceptionError(LocalDateTime.now(),"data not valid",e.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

}
