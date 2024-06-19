package looslyCoupledClasses;

public class Employee2 {
	
	private String jobRole;
	private String programmingLang;
	private double salary;
	
	public Employee2(String jobRole, String programmingLang, double salary) {
		super();
		this.jobRole = jobRole;
		this.programmingLang = programmingLang;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [jobRole=" + jobRole + ", programmingLang=" + programmingLang + ", salary=" + salary + "]";
	}

}
