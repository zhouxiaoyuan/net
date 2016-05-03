package com.ge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ge.model.Brand;
import com.ge.service.BrandService;

@Controller
@RequestMapping("/brand")
public class BrandController {
	
	@Autowired
	BrandService brandService;

	@RequestMapping("/intoList")
	public String intoList() {
		return "list_brand";
	}
	
	@RequestMapping("/intoAdd")
	public String intoAdd() {
		return "add_brand";
	}
	
	@RequestMapping("/add")
	public String add(Brand brand,Model model) {
		
		brandService.save(brand);
		return "add_brand";
	}
	
	@RequestMapping("/intoEdit")
	public String intoEdit(Model model) {
		return "edit_brand";
	}
	
}
