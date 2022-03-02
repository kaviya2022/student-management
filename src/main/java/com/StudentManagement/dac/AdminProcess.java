package com.StudentManagement.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.StudentManagement.dac.DatabaseConnectivity;

public class AdminProcess {

	
		DatabaseConnectivity ob=new DatabaseConnectivity();
		Connection conn= ob.dbConnection();
		
		public boolean login(int Admin_id,String password) throws SQLException 
		{
			
			
			PreparedStatement ps=conn.prepareStatement("select * from Admin where Admin_id=? && password=?");
			ps.setInt(1, Admin_id);
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

				public boolean Studentdetails(long studid,String studentname,String studentaddress,String studFathername,String gender,String studStandard,long phone,long presenteddays) throws SQLException
				{
					PreparedStatement ps=conn.prepareStatement("insert into Studentdetails values(?,?,?,?,?,?,?,?)");
					ps.setLong(1, studid);
					ps.setString(2, studentname);
					ps.setString(3, studentaddress);
					ps.setString(4, studFathername);
					ps.setString(5, gender);
					ps.setString(6, studStandard);
					ps.setLong(7, phone);
					ps.setLong(8, presenteddays);
					
					int affectedRows=ps.executeUpdate();
					
					if(affectedRows>0)
						return true;
					else
						return false;
				}
				
				
				public boolean schoolinformation() throws SQLException
				 {
						return true;
					
						}
				
				public boolean gradesystem() throws SQLException
				 {
					   
				       return true;
							
			     }   
				
				public boolean studentFees(long primarily,long lower,long higher) throws SQLException
				{
					PreparedStatement ps=conn.prepareStatement("insert into studentFees values(?,?,?)");
				    ps.setLong(1, primarily);
					ps.setLong(2, lower);
					ps.setLong(3, higher);
					
					int affectedRows=ps.executeUpdate();
					if(affectedRows>0)
						return true;
					else
						return false;
				}

				
				public boolean salarydetails(long lowersection,long highersection) throws SQLException
				{
					PreparedStatement ps=conn.prepareStatement("insert into salarydetails values(?,?)");
				     ps.setLong(1, lowersection);
					ps.setLong(2, highersection);
					
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
