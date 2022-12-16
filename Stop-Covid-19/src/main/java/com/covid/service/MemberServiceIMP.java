package com.covide.service;

import org.springframework.stereotype.Service;

import com.covid.exception.IdCardException;
import com.covid.exception.MemberException;
import com.covid.model.Member;

@Service
public class MemberServiceIMP implements MemberService{
	
	//dao member

	@Override
	public Member getMemberById(Integer idcardid) throws MemberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberAdharNo(long adharNo) throws IdCardException, MemberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberPanNo(String panNo) throws IdCardException, MemberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member addMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(Member member) throws MemberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteMember(Member member) throws MemberException {
		// TODO Auto-generated method stub
		return false;
	}

}
