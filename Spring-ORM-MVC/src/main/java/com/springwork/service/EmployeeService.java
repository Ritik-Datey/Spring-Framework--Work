package com.springwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwork.dao.EmployeeDAO;
import com.springwork.model.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public Employee getEmployeeById(int id) {
		return employeeDAO.getById(id);
	}
	
	public List<Employee> getAllEmployee(){
		return employeeDAO.getAll();
	}
	
	@Transactional
	public void deleteEmployee(int id) {
		employeeDAO.delete(id);
	}

}
