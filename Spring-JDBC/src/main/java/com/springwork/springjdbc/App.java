package com.springwork.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springwork.springjdbc.dao.EmployeeDAO;
import com.springwork.springjdbc.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	EmployeeDAO dao = context.getBean("employeeDAOImpl", EmployeeDAO.class);
    	
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    		System.out.println(" ** What Operation would you like to performed ** ");
    		System.out.println("             1. Insert. ");
    		System.out.println("             2. Fectch By Id. ");
    		System.out.println("             3. Update Salary. ");
    		System.out.println("             4. Delete By Id. ");
    		System.out.println("             5. Fetch All. ");
    		System.out.println("             6. Exit. ");
    		System.out.println("-> ");
    		
    		switch (sc.nextInt()) {
			case 1:{ //Insert
				
				Employee emp = new Employee();
				System.out.println("Enter Id : ");
		    	emp.setEmpId(sc.nextInt());
		    	System.out.println("Enter Name : ");
		    	emp.setEmpName(sc.next());
		    	System.out.println("Enter Role : ");
		    	emp.setEmpRole(sc.next());
		    	System.out.println("Enter Salary : ");
		    	emp.setEmpSalary(sc.nextDouble());
		    	
		    	int result = dao.insert(emp);
		    	if(result != 0) {
		    		System.out.println("Data Inserted");
		    	}else {
		    		System.out.println("Something went wrong");
		    	}
			}		    	
				break;
			case 2:{//	Fetch By Id
				System.out.println("Enter Id");
				
		    	Employee fetch = dao.fetch(sc.nextInt());
		    	if(fetch!=null) {
		        	System.out.println(fetch);
		    	}else {
		        	System.out.println("Something went wrong");
		    	}
			}	
				break;
			case 3:{//   Update salary
		    	Employee emp = new Employee();
		    	System.out.println("Enter Id : ");
		    	emp.setEmpId(1);
		    	System.out.println("Enter New Salary : ");
		    	emp.setEmpSalary(250000);
		    	
		    	int result = dao.update(emp);
		    	if(result != 0) {
		    		System.out.println("Data Updated");
		    	}else {
		    		System.out.println("Something went wrong");
		    	}
			}
				break;
			case 4:{//	Delete
				System.out.println("Enter Id(to delete) :");
		    	int result = dao.delete(sc.nextInt());
		    	if(result != 0) {
		    		System.out.println("Data Deleted");
		    	}else {
		    		System.out.println("Something went wrong");
		    	}
			}
				break;
			case 5:{//	Fetch All
		    	List<Employee> allData = dao.allData();
		    	 
		    	for (Employee employee : allData) {
					System.out.println(employee);
				}
			}
				break;
			case 6:{//	Exit
				System.exit(0);
			}
				break;
			default:
				System.out.println("Wrong Input.");
				System.out.println();
				break;
			}
    	}

    	
    }
    
}
