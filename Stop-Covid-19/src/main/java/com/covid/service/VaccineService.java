package com.covide.service;

import java.util.List;

import com.covid.exception.VaccineException;
import com.covid.model.Vaccine;

public interface VaccineService {

	public List<Vaccine> allVaccine();
	public Vaccine getVaccineByName(String vaccineName) throws VaccineException;
	public Vaccine getVaccineById(Integer vaccineId) throws VaccineException;
	public Vaccine addVaccine(Vaccine vaccine);
	public Vaccine updateVaccine(Vaccine vaccine) throws VaccineException;
	public boolean deleteVaccine(Vaccine vaccine) throws VaccineException;
}
