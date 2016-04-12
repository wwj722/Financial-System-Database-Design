package ExamplePackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Userinformation {
	
	
	static Connection currentCon = null;
	static ResultSet rs = null;
	public static String username;
	public static String name;
	public static String department;
	public static String authority;
	public static String id;
	public static UserBean information(UserBean bean){
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
			rs.next();
			
			username = rs.getString("Username");
			department = rs.getString("department");
				name = rs.getString("Name");
				authority = rs.getString("Authority");
				id = rs.getString("id");
				
				System.out.println("Welcome" + name + username + department + authority + id);
	
			

		
			
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
