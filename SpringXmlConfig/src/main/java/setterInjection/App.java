package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SetterInjection.xml");
		Employee obj=context.getBean(Employee.class);
		System.out.println(obj);		

	}

}
