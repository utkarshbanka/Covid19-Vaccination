package com.covide.service;

import java.time.LocalDate;
import java.util.List;

import com.covid.exception.VaccineCenterException;
import com.covid.exception.VaccineException;
import com.covid.exception.VaccineInventoryException;
import com.covid.model.Vaccine;
import com.covid.model.VaccineInventory;

public interface VaccineInventoryService {

	public List<VaccineInventory> allVaccineInvetory();
	public VaccineInventory getVaccineInventoryByCenter(Integer centerId) throws VaccineInventoryException;
	public VaccineInventory addVaccineCount(VaccineInventory inv);
	public VaccineInventory updateVaccineInventory(VaccineInventory inv) throws VaccineInventoryException;
	public boolean deleteVaccineInventory(VaccineInventory inv) throws VaccineInventoryException;
	public List<VaccineInventory> getVaccineInventoryByDate(LocalDate date) throws VaccineInventoryException;
	public List<VaccineInventory> getvaccineInventoryByVaccine(Vaccine vaccine) throws VaccineException,VaccineInventoryException;
}
