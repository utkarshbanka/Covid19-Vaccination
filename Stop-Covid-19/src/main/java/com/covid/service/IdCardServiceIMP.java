package com.covide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.IdCardException;
import com.covid.model.IdCard;
import com.covid.repository.IdCardDAO;

@Service
public class IdCardServiceIMP  implements IdCardService{
	
	@Autowired
	private IdCardDAO icdao;

	@Override
	public IdCard getPanCardByNumber(String panNo) throws IdCardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdCard getAdharCardByNo(long adharno) throws IdCardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdCard addidCard(IdCard idcard) {
		// TODO Auto-generated method stub
		return null;
	}

}
