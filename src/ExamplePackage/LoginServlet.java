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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, java.io.IOException {
		try
		{   
			UserBean user = new UserBean();
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			
			
			user = UserDAO.login(user);
			
			UserBean information = new UserBean();
			
			information.setUsername(request.getParameter("username"));
			information.setPassword(request.getParameter("password"));
			information = Userinformation.information(user);
			
			
			if(user.isValid())
			{
				response.sendRedirect("home.jsp");
			}
			else
				response.sendRedirect("invalidLogin.jsp");
		}
		catch (Throwable theException)
		{
			System.out.println(theException);
		}
	}	
}
