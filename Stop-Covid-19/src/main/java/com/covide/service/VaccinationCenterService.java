package com.covide.service;

import java.util.List;

import com.covid.exception.VaccineCenterException;
import com.covid.model.VaccinetionCenter;

public interface VaccinationCenterService {

	public List<VaccinetionCenter> getVaccineCenter();
	public VaccinetionCenter getVaccinetionCenter(Integer centerid) throws VaccineCenterException;
	public VaccinetionCenter addVaccinetionCenter(VaccinetionCenter center);
	public VaccinetionCenter updateVaccinetionCenter(VaccinetionCenter center) throws VaccineCenterException;
	public boolean deleteVaccinetonCenter(VaccinetionCenter center) throws VaccineCenterException;
}
