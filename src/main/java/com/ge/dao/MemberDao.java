/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.ge.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ge.model.Member;


/**
 * 站点DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@Repository("memberDao")
public interface MemberDao {

	
	public List<Member> getAllMembers();
}
