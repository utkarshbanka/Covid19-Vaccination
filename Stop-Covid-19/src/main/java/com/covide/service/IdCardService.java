package com.covide.service;

import com.covid.exception.IdCardException;
import com.covid.model.IdCard;

public interface IdCardService {
	
	public IdCard getPanCardByNumber(String panNo) throws IdCardException;
	public IdCard getAdharCardByNo(long adharno) throws IdCardException;
	public IdCard addidCard(IdCard idcard);

}
