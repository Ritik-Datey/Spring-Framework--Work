package constructorInjection;

public class Student {
	
	private String name;
	private String course;
	private int rollNo;
	private double fee;
	
	public Student(String name, String course, int rollNo, double fee) {
		super();
		this.name = name;
		this.course = course;
		this.rollNo = rollNo;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", rollNo=" + rollNo + ", fee=" + fee + "]";
	}
	
}
