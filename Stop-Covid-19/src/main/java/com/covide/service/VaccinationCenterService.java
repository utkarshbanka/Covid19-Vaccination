package com.covide.service;

import java.util.List;

import com.covid.exception.VaccineCenterException;
import com.covid.model.VaccinationCenter;

public interface VaccinationCenterService {

	public List<VaccinationCenter> getVaccineCenter();
	public VaccinationCenter getVaccinetionCenter(Integer centerid) throws VaccineCenterException;
	public VaccinationCenter addVaccinetionCenter(VaccinationCenter center);
	public VaccinationCenter updateVaccinetionCenter(VaccinationCenter center) throws VaccineCenterException;
	public boolean deleteVaccinetonCenter(VaccinationCenter center) throws VaccineCenterException;
}
