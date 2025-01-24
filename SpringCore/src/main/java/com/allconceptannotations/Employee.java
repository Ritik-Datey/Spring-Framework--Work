package com.allconceptannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("employee.properties")
public class Employee {
	
	@Value("${emp.id}")
	private int id;
	@Value("${emp.name}")
	private String name;
	@Value("${emp.salary}")
	private double salary;
	
	@Autowired
	private Address address;
	
	private Department department;
	
	Employee(Department department){
		this.department=department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", department="
				+ department + "]";
	}
	
	
	
	
	

}
