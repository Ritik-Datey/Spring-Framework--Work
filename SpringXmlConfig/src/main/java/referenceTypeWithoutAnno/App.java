package referenceTypeWithoutAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ReferenceTypeWithoutAnno.xml");
		System.out.println(context.getBean(Car.class));

	}

}
