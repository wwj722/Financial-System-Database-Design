package ExamplePackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ExamplePackage.Userinformation;

/**
 * Servlet implementation class AuthorityApplicationServlet
 */
@WebServlet("/AuthorityApplicationServlet")
public class AuthorityApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
	
		try{			
		AuthorityBean user = new AuthorityBean();
						user.setAuthority(request.getParameter("authorityapp"));
						user = AuthorityApplication.apply(user);
						
						
						if(user.isValid())
						{
						
							response.sendRedirect("AuthorityApplication.jsp");
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


		