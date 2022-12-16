package com.covide.service;

import java.util.List;

import com.covid.exception.AppointmentException;
import com.covid.model.Appointment;

public interface AppointmentService {
	
	public List<Appointment> allAppointment();
	public Appointment getAppointment(long bookingid) throws AppointmentException;
	public Appointment addAppointment(Appointment app) ;
	public Appointment updateAppointment(Appointment app) throws AppointmentException;
	public boolean deleteAppointment(Appointment app) throws AppointmentException;
	

}
