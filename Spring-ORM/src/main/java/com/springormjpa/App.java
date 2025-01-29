package com.springormjpa;

import com.springormjpa.dao.EmployeeDAO;
import com.springormjpa.entities.Employee;
import com.springormjpa.service.EmployeeService;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);

//        // Add Employee
//        Employee employee = new Employee(212,"John Doe", "Berojgar Munda", 75000);
//        employeeDAO.saveEmployee(employee);
//
//        // Fetch Employee  
//        Employee employee2 = employeeDAO.getEmployeeById(1);
//        System.out.println(employee2);
        
//        employeeDAO.deleteEmployeeById(212);
        
   //     employeeDAO.updateEmployeeById(1, 213123131);
        
        List<Employee> employee = employeeDAO.getAllEmployees();
        for(Employee emp : employee) {
        	System.out.println(emp);
        }
        
    }
}
