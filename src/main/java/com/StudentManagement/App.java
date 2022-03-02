package com.StudentManagement;

import java.util.Scanner;

import com.StudentManagement.dac.AdminProcess;
import com.StudentManagement.dac.StaffUserModule;
import com.StudentManagement.dac.StudentUserModule;

public class App 
{
    public static void main( String[] args )
    {
    	boolean status=true;
    	try
    	{
    		do
    		{
        Scanner scan=new Scanner(System.in);
        System.out.println("=======================================================================");
        System.out.println("                            Welcome to CSI School                        ");
        System.out.println("=======================================================================");
        System.out.println("1 -> Admin");
        System.out.println("2 -> StaffUser");
        System.out.println("3 -> StudentUser");
        System.out.println("Enter your account type:");
        int userType=scan.nextInt();
        
        if(userType==1)
        {
        	
       	System.out.println("Enter your Admin id:");
        	int Admin_id=scan.nextInt();
        	System.out.println("Enter Password:");
        	String password=scan.next();
        	
        	AdminProcess ob=new AdminProcess();
        	
        	if(ob.login(Admin_id, password))
        	{
                System.out.println("=======================================================================");
        		System.out.println("Login successfull!!");
                System.out.println("=======================================================================");
        		System.out.println("1.Students Details\r\n"
        				+ "2.SchoolInformation\r\n"
        				+ "3.Grade System details\r\n"
        				+ "4.Students Fees details\r\n"
        				+ "5.Staff Salary details\r\n"
        				+ "6.logout");
        	int op=scan.nextInt();
        	
        	if(op==1)
        	{
        		System.out.println("Enter  Student Id:");
        		long studid=scan.nextLong();
        		System.out.println("Enter  Student name:");
        		String studentname=scan.next();
        		System.out.println("Enter Student address:");
        		String studentaddress=scan.next();
        		System.out.println("Enter StudentFather name:");
        		String studFathername=scan.next();
        		System.out.println("Enter Gender:");
        		String gender=scan.next();
        		System.out.println("Enter Student standard:");
        		String standard=scan.next();
        		System.out.println("Enter phone number:");
        		long phone=scan.nextLong();
        		System.out.println("Number of days presented:");
        		Long presenteddays=scan.nextLong();
        		if(ob.Studentdetails(studid,studentname,studentaddress,studFathername,gender,standard,phone,presenteddays))
        		{
                    System.out.println("=======================================================================");
        			System.out.println("Students details created successfully!!");
                    System.out.println("=======================================================================");

        		}
        		else
        		{   System.out.println("=======================================================================");
        			System.out.println("Problem in details creation!!");
                    System.out.println("=======================================================================");

        		}
        	}
        	
        	
        	
        	if(op==2)
        	{
        		if(ob.schoolinformation())
        		{   
        			status=false;
        			System.out.println("=======================================================================");
                    System.out.println("CSI School is a famous school in the city.Its a many branches in the world.The students are learning new methods in every day!!");
        			System.out.println("=======================================================================");
       
        		}
        		else
        		{
        			System.out.println("Problem occurred!!");
        		}
        	}
        	
        	if(op==3)
        	{
        		if(ob.gradesystem())
        		{   
        			status=false;
        			System.out.println("===================================================================================");
                    System.out.println("Letter Grade-----> O(Outstanding),A+(Excellent),A(Very Good),B+(Good),B()Average");
                    System.out.println("Grade Points----->      10     ,      9      ,      8    ,       7  ,    6  ");
                    System.out.println("Marks Range------>      91-100  ,    81-90    ,     71-80   ,    61-70  ,50-60  ");
                    System.out.println("====================================================================================");

        		}
        		else
        		{
        			System.out.println("Problem occurred!!");
        		}
        	}
        	
        	else if(op==4)
        	{
        		
        		System.out.println("PrimarilySection fees  List:");
        		long primarily=scan.nextLong();
        		System.out.println("LowerSecondary fees List:");
        		long lower=scan.nextLong();
        		System.out.println("HigherSecondary List:");
        		long higher=scan.nextLong();
        		
        		
        		if(ob.studentFees(primarily,lower,higher))
        		{
        			System.out.println("Created successfully!!");
        		}
        		else
        		{
        			System.out.println("Problem occurred!!");
        		}
        	}

        	
        	
        	else if(op==5)
        	{
        		
        		System.out.println("LowerSection Salary List:");
        		long lowersection=scan.nextLong();
        		System.out.println("HigherSection Salary List:");
        		long highersection=scan.nextLong();
        		
        		
        		if(ob.salarydetails(lowersection,highersection))
        		{
        			System.out.println("Viwed successfully!!");
        		}
        		else
        		{
        			System.out.println("Problem occurred!!");
        		}
        	}
        	
        	else if(op==6)
        	{
        		if(ob.logout())
        		{   
        			status=false;
        			System.out.println("=======================================================================");
                 
        			System.out.println("logged out!!");
        			System.out.println("Thank You.");
        			System.out.println("=======================================================================");

        		}
        	}
        	}
        	else
        	{
        		System.out.println("Login unsuccessfull!!");
        	}
        		
        	}
        		
        	
        
        
        
        if(userType==2)
        {
        	
       	System.out.println("Enter your Staff id:");
        	int staffid=scan.nextInt();
        	System.out.println("Enter Password:");
        	String password=scan.next();
        	
        	StaffUserModule ob=new StaffUserModule();
        	
        	if(ob.login(staffid, password))
        	{
                System.out.println("=======================================================================");
        		System.out.println("Login successfull!!");
                System.out.println("=======================================================================");
        		System.out.println("1.Staff Registration\r\n"
        				+ "2.Student Information\r\n"
        				+ "3.logout");
        	int operation=scan.nextInt();
        	
        	if(operation==1) 
        	{
        		
        		System.out.println("Enter Staff name:");
        		String stafname=scan.next();
        		System.out.println("Enter Staff address:");
        		String stafaddress=scan.next();
        		System.out.println("Enter phone number:");
        		long phone=scan.nextLong();
        		System.out.println("Enter valid email id:");
        		String email=scan.next();
        		System.out.println("Enter Qualification :");
        		String qualification=scan.next();
        		System.out.println("Enter the Experience :");
        		String experience=scan.next();
        		System.out.println("Enter the Exception Salary:");
        		Long salary=scan.nextLong();
        		
        		if(ob.staffRegistration(stafname,stafaddress,phone,email,qualification,experience,salary))
        		{
                    System.out.println("=======================================================================");
        			System.out.println("Registration successfully!!");
                    System.out.println("=======================================================================");

        		}
        		else
        		{   System.out.println("=======================================================================");
        			System.out.println("Problem in details creation!!");
                    System.out.println("=======================================================================");

        		}
        		
        		
        	}
        	else if(operation==2)
        	{
        		System.out.println("Enter  Student Id:");
        		long studid=scan.nextLong();
        		System.out.println("Enter  Student name:");
        		String studentname=scan.next();
        		System.out.println("Enter Student address:");
        		String studentaddress=scan.next();
        		System.out.println("Enter phone number:");
        		long phone=scan.nextLong();
        		System.out.println("Enter Student standard:");
        		long standard=scan.nextLong();
        		
        		if(ob.studentinformation(studid,studentname,studentaddress,phone,standard))
        		{
                    System.out.println("=======================================================================");
        			System.out.println("Update Student Details Successfully!!");
                    System.out.println("=======================================================================");

        		}
        		else
        		{   System.out.println("=======================================================================");
        			System.out.println("Problem in details creation!!");
                    System.out.println("=======================================================================");

        		}
        		
        	}
        	else if(operation==3)
    		{
    			ob.logout();
    			System.out.println("====================================");
    			System.out.println("Log Out!!!");
    		    System.out.println("=====================================");
    		}
    		
    		
    		
        	}
        	
        	
        	   if(userType==3)
               {
               	
              	System.out.println("Enter your Student name:");
               	String stud_name=scan.next();
               	System.out.println("Enter Password:");
               	String password1=scan.next();
               	
               	StudentUserModule ob3=new StudentUserModule();
               	
               	if(ob3.login(stud_name, password1))
               	{
                       System.out.println("=======================================================================");
               		System.out.println("Login successfull!!");
                       System.out.println("=======================================================================");
               		System.out.println("1.Student Registration\r\n"
               				+ "2.logout");
               	int operation=scan.nextInt();
             	
             	if(operation==1)
            	{
            		
            		System.out.println("Enter  Student name:");
            		String studentname=scan.next();
            		System.out.println("Enter Student address:");
            		String studentaddress=scan.next();
            		System.out.println("Enter StudentFather name:");
            		String studFathername=scan.next();
            		System.out.println("Enter Gender:");
            		String gender=scan.next();
            		System.out.println("Enter Student standard:");
            		String standard=scan.next();
            		System.out.println("Enter phone number:");
            		long phone=scan.nextLong();
            		
            		if(ob3.studentRegistration(studentname,studentaddress,studFathername,gender,standard,phone))
            		{
                        System.out.println("=======================================================================");
            			System.out.println("Students Registration successfully!!");
                        System.out.println("=======================================================================");

            		}
            		else
            		{   System.out.println("=======================================================================");
            			System.out.println("Problem in details creation!!");
                        System.out.println("=======================================================================");

            		}
            	}   
             	else if(operation==2)
        		{
        			ob3.logout();
        			System.out.println("====================================");
        			System.out.println("Log Out!!!");
        		    System.out.println("=====================================");
        		}
        		
        			}
             }
             	
             	else
            	{
            		System.out.println("=======================================================================");
            		System.out.println("Wrong Id or password!!");
            		System.out.println("=======================================================================");

            	}
            }
            
          }
        		while(status);		
        	}
        	catch(Exception e)
        	{
        		System.out.println(e.getMessage());
        	}
        	
             }
        }

