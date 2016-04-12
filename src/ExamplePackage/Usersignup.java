package ExamplePackage;

import java.text.*;
import java.util.*;
import java.sql.*;

public class Usersignup {
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	public static UserBean signup(UserBean bean){
		//prepare some objects for connection
		Statement stmt = null;
		
		String employmentid = bean.getEmploymentID();
		String username = bean.getUsername();
		String password = bean.getPassword();
		String name = bean.getName();
		String department = bean.getDepartment();
		String email = bean.getEmail();
		
		String Query = "insert into User (id, Username, Name, Email, Authority, password, department)"
				+ "values('"
				+ employmentid
				+ "','"
				+ username
				+"','"
				+ name
				+"','"
				+email
				+"','"
				+ "User','"
				+ password
				+ "','"
				+ department
				+ "')";
				
		
		//prints in the console, used to trace the process
		System.out.println("Your password is" + employmentid);
		System.out.println("Your password is" + name);
		System.out.println("Your password is" + password);
		System.out.println("Your password is" + department);
		System.out.println("Query" + Query);
		
		String Query2 = "select * from User where id = '"
		        + employmentid
		        + "'";
		
		try{
			//connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.execute(Query);
			rs = stmt.executeQuery(Query2);
			boolean more = rs.next();	
			
			if(!more)
			{
				System.out.println("Sorry, some problems occurred!");
				bean.setValid(false);
			}
			
			//if user exists, the isValid variable to true
			else if(more)
			{
				System.out.println("Welcome" + name);
			
				bean.setValid(true);
			}
			
			
			
		}
	catch (Exception ex)
		{
		System.out.println("Signup fialed: An exception has occurred" + ex);
		}
		
		//some exception handling
		finally
		{
			if(rs!=null){
				try {
					rs.close();
				}catch (Exception e){}
				rs = null;
			}
			if(stmt!=null){
				try{
					stmt.close();
				}catch (Exception e){}
				stmt = null;
			}
			if(currentCon!=null){
				try{
					currentCon.close();
				}catch (Exception e){}
				currentCon = null;
			}
		}
		return bean;
	}

}
