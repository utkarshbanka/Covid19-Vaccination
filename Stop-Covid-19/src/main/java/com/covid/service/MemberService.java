package com.covide.service;

import com.covid.exception.IdCardException;
import com.covid.exception.MemberException;
import com.covid.model.Member;

public interface MemberService {
	
	public Member getMemberById(Integer idcardid) throws MemberException;
	public Member getMemberAdharNo(long adharNo) throws IdCardException, MemberException;
	public Member getMemberPanNo(String panNo) throws IdCardException, MemberException;
	public Member addMember(Member member);
	public Member updateMember(Member member) throws MemberException;
	public boolean deleteMember(Member member) throws MemberException;

}
