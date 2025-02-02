package com.springwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springwork.model.Employee;
import com.springwork.service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	static int id = 2 ;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("empDetails")
	public String employeeData(@ModelAttribute Employee employee, Model model) {
		employee.setId(id);
		employeeService.addEmployee(employee);
		id++;
		model.addAttribute("employee" , employee);
		return "displayData";
	}

}
