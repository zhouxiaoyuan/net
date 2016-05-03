package com.ge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brand")
public class BrandController {

	
	
	
	@RequestMapping("/intoAdd")
	public String intoAdd(Model model) {
		return "add_brand";
	}
	
	@RequestMapping("/add")
	public String add(Model model) {
		return "add_brand";
	}
	
	@RequestMapping("/intoEdit")
	public String intoEdit(Model model) {
		return "edit_brand";
	}
	
}
