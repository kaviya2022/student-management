package com.StudentManagement.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffUserModule {

	
	DatabaseConnectivity ob=new DatabaseConnectivity();
	Connection conn= ob.dbConnection();
	
	public boolean login(int staffid,String password) throws SQLException 
	{
		
		
		PreparedStatement ps=conn.prepareStatement("select * from staffUser where staffid=? && password=?");
		ps.setInt(1, staffid);
		ps.setString(2, password);
		ResultSet result=ps.executeQuery();
		
		
			if(result.next())
			{
				return true; 
			}
			else
			{
				return false;
			}
	
		}
	
	public boolean staffRegistration(String stafname,String stafaddress,long phone,String email,String qualification,String experience,long salary) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("insert into staffRegistration values(?,?,?,?,?,?,?)");
		
		ps.setString(1, stafname);
		ps.setString(2, stafaddress);
		ps.setLong(3, phone);
		ps.setString(4,email);
		ps.setString(5,qualification);
		ps.setString(6, experience);
		ps.setLong(7,salary);
		
		
		int affectedRows=ps.executeUpdate();
		
		if(affectedRows>0)
			return true;
		else
			return false;
	}
	
	public boolean studentinformation(long studid,String studentname,String studentaddress,long phone,long studStandard) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("insert into studentinformation values(?,?,?,?,?)");
		ps.setLong(1, studid);
		ps.setString(2, studentname);
		ps.setString(3, studentaddress);
		ps.setLong(4, phone);
		ps.setLong(5, studStandard);
	
		
		
		int affectedRows=ps.executeUpdate();
		
		if(affectedRows>0)
			return true;
		else
			return false;
	}


	public boolean logout() throws SQLException {
		conn.close();
		return true;
		
	}

	
}
