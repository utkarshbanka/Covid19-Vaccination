package com.covide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.VaccineRegistrationException;
import com.covid.model.Member;
import com.covid.model.VaccineRegistration;
import com.covid.repository.VaccineResitrationDAO;

@Service
public class VaccineRegistrationServiceIMP implements vaccineRegistrationService{

	@Autowired
	private VaccineResitrationDAO vrdao;
	
	@Override
	public List<VaccineRegistration> allVaccineRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineRegistration getVaccineRegistration(long mobileno) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> gerAllMember(long moblieno) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration reg) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccineRegistration(vaccineRegistrationService reg) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return false;
	}

}
