package com.StudentManagement.dac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	
	public Connection dbConnection()
	{
		Connection conn= null;
		
		 String databaseurl="jdbc:mysql://localhost:3306/studentmanagement";
	      String userName="root";
	      String userPassword="mysql";
	      
	      try 
	      {
			conn=DriverManager.getConnection(databaseurl,userName,userPassword);
		    
	      
	      } 
	    catch (SQLException e)
	      {
			
			System.out.println("Server Problem !!");
		}
	      return conn;
	}

}
