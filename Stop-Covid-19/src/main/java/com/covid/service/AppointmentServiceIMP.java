package com.covide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.AppointmentException;
import com.covid.model.Appointment;
import com.covid.repository.AppointmnetDAO;

@Service
public class AppointmentServiceIMP implements AppointmentService{
	
	@Autowired
	private AppointmnetDAO adao;

	@Override
	public List<Appointment> allAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointment(long bookingid) throws AppointmentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment addAppointment(Appointment app) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment updateAppointment(Appointment app) throws AppointmentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAppointment(Appointment app) throws AppointmentException {
		// TODO Auto-generated method stub
		return false;
	}

}
