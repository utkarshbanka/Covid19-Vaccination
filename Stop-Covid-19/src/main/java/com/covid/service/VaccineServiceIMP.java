package com.covide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.VaccineException;
import com.covid.model.Vaccine;
import com.covid.repository.VaccineDAO;

@Service
public class VaccineServiceIMP implements VaccineService {
	
	@Autowired
	private VaccineDAO vdao;

	@Override
	public List<Vaccine> allVaccine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine getVaccineByName(String vaccineName) throws VaccineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine getVaccineById(Integer vaccineId) throws VaccineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine addVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine updateVaccine(Vaccine vaccine) throws VaccineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccine(Vaccine vaccine) throws VaccineException {
		// TODO Auto-generated method stub
		return false;
	}

}
