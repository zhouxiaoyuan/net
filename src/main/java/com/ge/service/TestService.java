package com.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.dao.MemberDao;
import com.ge.model.Member;


@Service
public class TestService {
	
	@Autowired
	private MemberDao memberDao;

	public List<Member> getTest(){
		List<Member> members = memberDao.getAllMembers();
		return members;
	}
	
	public Member getRealName(String realName){
		Member member = memberDao.getMemberByRealname(realName);
		return member;
	}
	
}
