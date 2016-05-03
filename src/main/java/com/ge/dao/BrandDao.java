/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.ge.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.ge.model.Brand;



/**
 * 站点DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@Repository("brandDao")
public interface BrandDao {
	
	public List<Brand> getAllBrand();
	
	//public Brand getBrandByRealname(String realName);
}
