package com.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.dao.BrandDao;
import com.ge.model.Brand;


@Service("brandService")
public class BrandService {
	
	@Autowired
	private BrandDao brandDao;

	public void save(Brand brand){
		
		brandDao.save( brand );
		
	}
	
}
