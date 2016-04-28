package com.ge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ge.service.TestService;

@Controller
public class IndexController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("members", testService.getTest());
		return "test";
	}
	
	@RequestMapping("/realName")
	public String getMemberByRealName(String realName ,Model model) {
		model.addAttribute("member", testService.getRealName(realName));
		return "member";
	}
	
	
}
