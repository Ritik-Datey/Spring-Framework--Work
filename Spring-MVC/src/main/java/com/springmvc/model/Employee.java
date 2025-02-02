package com.springmvc.model;

public class Employee {

	private int id;
	private String prefix;
	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;
	private String email;
	private String phone;
	private String education;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String prefix, String firstname, String middlename, String lastname, String gender,
			String email, String phone, String education) {
		super();
		this.id = id;
		this.prefix = prefix;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.education = education;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", prefix=" + prefix + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ ", education=" + education + "]";
	}
	
}
