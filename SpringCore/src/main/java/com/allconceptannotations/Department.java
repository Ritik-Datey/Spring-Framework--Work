package com.allconceptannotations;

public class Department {
	
	private String deptName;
	private String deptLocation;
	private String deptHead;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptLocation=" + deptLocation + ", deptHead=" + deptHead + "]";
	}
	

}
