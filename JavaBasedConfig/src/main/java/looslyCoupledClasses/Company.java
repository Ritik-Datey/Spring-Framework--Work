package looslyCoupledClasses;

public class Company {
	
	private Employee1 employee1;
	private Employee2 employee2;
	
	public Company(Employee1 employee1, Employee2 employee2) {
		super();
		this.employee1 = employee1;
		this.employee2 = employee2;
	}

	@Override
	public String toString() {
		return "Company [employee1=" + employee1 + ", employee2=" + employee2 + "]";
	}
	

}
