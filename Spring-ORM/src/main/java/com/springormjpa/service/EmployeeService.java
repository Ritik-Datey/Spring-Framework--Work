package com.springormjpa.service;

import com.springormjpa.dao.EmployeeDAO;
import com.springormjpa.entities.Employee;

public class EmployeeService {

    private EmployeeDAO employeeDAO;

    // Constructor Injection
    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.saveEmployee(employee);
	}

    
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

	
}
