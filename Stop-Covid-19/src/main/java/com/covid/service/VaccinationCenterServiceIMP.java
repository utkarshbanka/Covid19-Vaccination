package com.covide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.VaccineCenterException;
import com.covid.model.VaccinationCenter;
import com.covid.repository.VaccineCenterDAO;

@Service
public class VaccinationCenterServiceIMP implements VaccinationCenterService{
	
	@Autowired
	private VaccineCenterDAO vcdao;

	@Override
	public List<VaccinationCenter> getVaccineCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinationCenter getVaccinetionCenter(Integer centerid) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinationCenter addVaccinetionCenter(VaccinationCenter center) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinationCenter updateVaccinetionCenter(VaccinationCenter center) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccinetonCenter(VaccinationCenter center) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return false;
	}

}
