package com.StudentManagement.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentUserModule {

	
	    
		DatabaseConnectivity ob=new DatabaseConnectivity();
		Connection conn= ob.dbConnection();
		
		public boolean login(String stud_name,String password) throws SQLException 
		{
			
			
			PreparedStatement ps=conn.prepareStatement("select * from studentUser where stud_name=? && password=?");
			ps.setString(1, stud_name);
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
				
				public boolean studentRegistration(String studentname,String studentaddress,String studFathername,String gender,String studStandard,long phone) throws SQLException
				{
					PreparedStatement ps=conn.prepareStatement("insert into Studentdetails values(?,?,?,?,?,?,)");
					
					ps.setString(2, studentname);
					ps.setString(3, studentaddress);
					ps.setString(4, studFathername);
					ps.setString(5, gender);
					ps.setString(6, studStandard);
					ps.setLong(7, phone);
				
					
					int affectedRows=ps.executeUpdate();
					
					if(affectedRows>0)
						return true;
					else
						return false;
				}
				
		

				 public boolean logout() throws SQLException
				 {
							conn.close();
							return true;
						}

}
