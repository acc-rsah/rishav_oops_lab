package com.itsupport.employee;

public class EmployeeInfo {
	
	private String FName;
	private String LName;
	
	public EmployeeInfo(String fName, String lName) {
		super();
		this.FName = fName;
		this.LName = lName;
	}
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	
}
