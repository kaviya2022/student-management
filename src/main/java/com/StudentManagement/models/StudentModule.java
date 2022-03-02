package com.StudentManagement.models;

public class StudentModule {

	int schoolStudentId;
	String schoolStudentname;
	String address;
	String password;
	public int getSchoolStudentId() {
		return schoolStudentId;
	}
	public void setSchoolStudentId(int schoolStudentId) {
		this.schoolStudentId = schoolStudentId;
	}
	public String getSchoolStudentname() {
		return schoolStudentname;
	}
	public void setSchoolStudentname(String schoolStudentname) {
		this.schoolStudentname = schoolStudentname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StudentModule(int schoolStudentId, String schoolStudentname, String address, String password) {
		super();
		this.schoolStudentId = schoolStudentId;
		this.schoolStudentname = schoolStudentname;
		this.address = address;
		this.password = password;
	}
	public StudentModule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
