package setterInjection;

public class Employee {
	
	private int id;
	private String jobRole;
	private String company;
	private double salary;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getJobRole() {
		return jobRole;
	}
	
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", jobRole=" + jobRole + ", company=" + company + ", salary=" + salary + "]";
	}
	

}
