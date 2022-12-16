package com.covide.service;

import java.util.List;

import com.covid.exception.VaccineRegistrationException;
import com.covid.model.Member;
import com.covid.model.VaccineRegistration;

public interface vaccineRegistrationService {
	
	public List<VaccineRegistration> allVaccineRegistrations();
	public VaccineRegistration getVaccineRegistration(long mobileno) throws VaccineRegistrationException;
	public List<Member> gerAllMember(long moblieno) throws VaccineRegistrationException;
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg);
	public VaccineRegistration updateVaccineRegistration (VaccineRegistration reg) throws VaccineRegistrationException;
	public boolean deleteVaccineRegistration(vaccineRegistrationService reg) throws VaccineRegistrationException;

}
