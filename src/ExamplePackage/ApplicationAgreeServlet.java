package ExamplePackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.FinancialSystem.Application;
import src.FinancialSystem.Connection;

/**
 * Servlet implementation class ApplicationAgreeServlet
 */
@WebServlet("/ApplicationAgreeServlet")
public class ApplicationAgreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationAgreeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = new Connection();
		int id = Integer.valueOf(request.getParameter("app_id"));
		String name = request.getParameter("app_name");
		String Department = request.getParameter("app_department");
		String Authority = request.getParameter("app_appliedAuthority");
		
		
		System.out.println(id + name + Department + Authority);
		conn.UpdateUser(id, name, Department, Authority);
		
		conn.DeleteApplication(id);
	
		response.sendRedirect("ApplicationSu.jsp");
		
		
	}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
