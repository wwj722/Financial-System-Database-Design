package ExamplePackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyAuthority
 */
@WebServlet("/ModifyAuthorityServlet")
public class ModifyAuthorityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
	
		try{			
		AuthorityBean user = new AuthorityBean();
						user.setUsername(request.getParameter("username"));
						user.setAuthority(request.getParameter("authority"));
						user.setEmploymentID(request.getParameter("employmentid"));
						user.setDepartment(request.getParameter("department"));
						
						
						user = ModifyAuthority.modify(user);
						
						
						if(user.isValid())
						{
						
							response.sendRedirect("ModifySuccess.jsp");
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

