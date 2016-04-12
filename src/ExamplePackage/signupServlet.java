package ExamplePackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
	 * Servlet implementation class LoginServlet
	 */
	@WebServlet("/signupServlet")
	public class signupServlet extends HttpServlet {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, java.io.IOException {
			try
			{
				UserBean user = new UserBean();
				user.setEmploymentID(request.getParameter("employmentid"));
				user.setUsername(request.getParameter("username"));
				user.setName(request.getParameter("name"));
				user.setPassword(request.getParameter("password"));
				user.setDepartment(request.getParameter("department"));
				user.setEmail(request.getParameter("email"));
				
				user = Usersignup.signup(user);
				
				if(user.isValid())
				{
					response.sendRedirect("Signupsuccess.jsp");
				}
				else
					response.sendRedirect("Signupfailed.jsp");
			}
			catch (Throwable theException)
			{
				System.out.println(theException);
			}
		}	
	}



