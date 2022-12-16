package com.covide.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.covid.exception.VaccineException;
import com.covid.exception.VaccineInventoryException;
import com.covid.model.Vaccine;
import com.covid.model.VaccineInventory;

@Service
public class VaccineInventoryServiceIMP implements VaccineInventoryService{

	//Dao wire
	
	@Override
	public List<VaccineInventory> allVaccineInvetory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineInventory getVaccineInventoryByCenter(Integer centerId) throws VaccineInventoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineInventory addVaccineCount(VaccineInventory inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineInventory updateVaccineInventory(VaccineInventory inv) throws VaccineInventoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccineInventory(VaccineInventory inv) throws VaccineInventoryException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<VaccineInventory> getVaccineInventoryByDate(LocalDate date) throws VaccineInventoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VaccineInventory> getvaccineInventoryByVaccine(Vaccine vaccine)
			throws VaccineException, VaccineInventoryException {
		// TODO Auto-generated method stub
		return null;
	}

}
