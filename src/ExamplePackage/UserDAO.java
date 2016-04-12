package ExamplePackage;

import java.text.*;
import java.util.*;
import java.sql.*;

public class UserDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	public static String username;
	public static UserBean login(UserBean bean){
		//prepare some objects for connection
		Statement stmt = null;
		
		username = bean.getUsername();
		String password = bean.getPassword();
		
		String searchQuery = "select * from User where username ='"
				+ username
				+ "'and password='"
				+ password
				+ "'";
		
		//prints in the console, used to trace the process
		System.out.println("Your username is" + username);
		System.out.println("Your password is" + password);
		System.out.println("Query" + searchQuery);
		
		try{
			//connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			//if users does not exist, set the isValid variable to flase
			if(!more)
			{
				System.out.println("Sorry, you are not a registered user! Please sign up first");
				bean.setValid(false);
			}
			
			//if user exists, the isValid variable to true
			else if(more)
			{
				String name = rs.getString("name");
				System.out.println("Welcome" + name);
				bean.setName(name);
				bean.setValid(true);
			}
			
		}
	catch (Exception ex)
		{
		System.out.println("Login fialed: An exception has occurred" + ex);
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
