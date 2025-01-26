package com.springwork.springjdbc.dao;

import java.util.List;

import com.springwork.springjdbc.entities.Employee;

public interface EmployeeDAO {
	
	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int employeeId);
	public Employee fetch(int employeeId);
	public List<Employee> allData();

}
