package com.allconceptannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		System.out.println();

	}

}
