package com.allconceptannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.allconceptannotations")
public class Config {
	
	@Bean
	public Department department() {
		
		Department department = new Department();
		
		department.setDeptName("Development");
		department.setDeptHead("Ritik Datey");
		department.setDeptLocation("Pune");
		
		return department;
		
	}

}
