package ExamplePackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
	
		try{			
		AuthorityBean user = new AuthorityBean();
						user.setUsername(request.getParameter("username"));
						
						user.setEmploymentID(request.getParameter("employmentid"));
						user.setDepartment(request.getParameter("department"));
						
						
						user = DeleteUser.delete(user);
						
						
						if(user.isValid())
						{
						
							response.sendRedirect("DeleteSuccess.jsp");
						}
						else{
							response.sendRedirect("errorback.jsp");
					}
		}
					catch (Throwable theException)
					{
						System.out.println(theException);
					}
				}	
		}

