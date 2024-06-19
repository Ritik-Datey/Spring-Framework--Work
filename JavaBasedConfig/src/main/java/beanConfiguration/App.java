package beanConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import looslyCoupledClasses.StaffConfig;

public class App {

	public static void main(String[] args) {

		BeanFactory context=new AnnotationConfigApplicationContext(StaffConfig.class);
		//System.out.println(context.getBean("name"));
		System.out.println(context.getBean("company"));
		System.out.println(context.getBean("employee1"));
		System.out.println(context.getBean("employee2"));
		
	}

}
