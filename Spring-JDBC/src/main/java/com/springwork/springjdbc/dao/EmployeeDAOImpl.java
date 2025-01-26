package com.springwork.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springwork.springjdbc.entities.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Employee employee) {
		
    	String query = "INSERT INTO Employee (empId, empName, empRole, empSalary) VALUES (?,?,?,?)";
    	
    	int result = this.template.update(query, employee.getEmpId(), employee.getEmpName(),employee.getEmpRole(), employee.getEmpSalary());
		
		return result;
	}

	@Override
	public int update(Employee employee) {
		
		String query = "UPDATE Employee SET empSalary=? WHERE empId=?";
    	
    	int result = this.template.update(query, employee.getEmpSalary(),employee.getEmpId());
		
		return result;
		
	}

	@Override
	public int delete(int employeeId) {
		
		String query = "DELETE FROM Employee WHERE empId=?";
    	
    	int result = this.template.update(query, employeeId);
		
		return result;
	
	}

	@Override
	public Employee fetch(int employeeId) {
		
		String query = "SELECT * FROM Employee WHERE empId=?";
		
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		
		Employee employee = this.template.queryForObject(query, rowMapper, employeeId );
				
		return employee;
	}

	@Override
	public List<Employee> allData() {
		String query = "SELECT * FROM Employee";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		List<Employee> list = this.template.query(query, rowMapper);
		return list;
	}

	

}
