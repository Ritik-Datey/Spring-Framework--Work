package looslyCoupledClasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaffConfig {

//	@Bean
//	public String name() {
//		return "Ritik Datey";
//	}
	
	@Bean
	public Company company() {
		return new Company(employee1(), employee2());
	}
	
	@Bean
	public Employee1 employee1() {
		return new Employee1("Java Developer", "Java", 45000);
	}
	
	@Bean
	public Employee2 employee2() {
		return new Employee2("SQl Developer", "MySQL", 30000);
	}
	
	
}
