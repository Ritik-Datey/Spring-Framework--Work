package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Employee;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("empDetails")
	public String employeeData(@ModelAttribute Employee employee, Model model) {
		
		model.addAttribute("employee", employee);
		
		return "displayData";
	}

}
