package com.covide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.VaccineCenterException;
import com.covid.model.VaccinetionCenter;
import com.covid.repository.VaccineCenterDAO;

@Service
public class VaccinationCenterServiceIMP implements VaccinationCenterService{
	
	@Autowired
	private VaccineCenterDAO vcdao;

	@Override
	public List<VaccinetionCenter> getVaccineCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinetionCenter getVaccinetionCenter(Integer centerid) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinetionCenter addVaccinetionCenter(VaccinetionCenter center) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinetionCenter updateVaccinetionCenter(VaccinetionCenter center) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccinetonCenter(VaccinetionCenter center) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return false;
	}

}
