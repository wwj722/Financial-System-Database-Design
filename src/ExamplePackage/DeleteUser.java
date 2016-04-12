package ExamplePackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteUser {
	
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	public static AuthorityBean delete(AuthorityBean bean){
		//prepare some objects for connection
		Statement stmt = null;
		
		String username = bean.getUsername();
		String department = bean.getDepartment();
		String id = bean.getEmploymentID();
		
		String DeleteQuery = "delete from User where username='"
				+ username
				+ "'and department='"
				+ department
				+ "'and id='"
				+ id
				+"'";
		
		//prints in the console, used to trace the process
		System.out.println("Your username is" + username);
		System.out.println("Your emplymentid is" + id);
		System.out.println("Your department is" + department);
		System.out.println("Query" + DeleteQuery);
		
		String resultquery = "select * from User where id='"
				+ id
				+ "' and username='"
				+ username
				+ "'";
		
		try{
			//connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.execute(DeleteQuery);
			rs = stmt.executeQuery(resultquery);
			boolean more = rs.next();
			
			//if Delete successfully, set the isValid variable to false, or false
			if(!more)
			{
			
				bean.setValid(true);
			}
			
			else if(more)
			{
	
				bean.setValid(false);
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


