package ExamplePackage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import ExamplePackage.Userinformation;



public class AuthorityApplication {
	
	
	
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	public static AuthorityBean apply(AuthorityBean bean){
		//prepare some objects for connection
		Statement stmt = null;
		
		String username = Userinformation.username;
		String applyauthority = bean.getAuthority();
		String employmentID = Userinformation.id;
		String name = Userinformation.name;
		String department = Userinformation.department;
		String currentAuthority = Userinformation.authority;
		
		String InsertQuery = "insert into application (employmentID, name, username, department, currentauthority, appliedauthority) values('"
				+ employmentID
				+ "', '"
				+ name
				+ "', '"
				+ username
				+ "', '"
				+ department
				+ "', '"
				+ currentAuthority
				+ "', '"
				+ applyauthority
				+"')";
		
		//prints in the console, used to trace the process
		System.out.println("Your username is: " + username);
		System.out.println("Your emplymentid is: " + employmentID);
		System.out.println("Your department is: " + department);
		System.out.println("Your department is: " + name);
		System.out.println("Your department is: " + currentAuthority);
		System.out.println("Your department is: " + applyauthority);
		System.out.println("Query is: " + InsertQuery);
		
		String resultquery = "select * from application where employmentID='"
				+ employmentID
				+ "' and currentauthority='"
				+ currentAuthority
				+ "' and appliedauthority='"
				+ applyauthority
				+ "'";
		
		try{
			//connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.execute(InsertQuery);
			rs = stmt.executeQuery(resultquery);
			boolean more = rs.next();
			
			//if insert successfully, set the isValid variable to true, or false
			if(!more)
			{
			
				bean.setValid(false);
			}
			
			else if(more)
			{
	
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
