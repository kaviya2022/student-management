package com.StudentManagement.models;

public class StaffModule {

	int School_staff_id;
	String School_staff_name;
	String password;
	
	
	public StaffModule(int school_staff_id, String school_staff_name, String password) {
		super();
		School_staff_id = school_staff_id;
		School_staff_name = school_staff_name;
		this.password = password;
	}
	
	
	public StaffModule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSchool_staff_id() {
		return School_staff_id;
	}
	public void setSchool_staff_id(int school_staff_id) {
		School_staff_id = school_staff_id;
	}
	public String getSchool_staff_name() {
		return School_staff_name;
	}
	public void setSchool_staff_name(String school_staff_name) {
		School_staff_name = school_staff_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
