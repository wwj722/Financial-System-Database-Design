package ExamplePackage;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.FinancialSystem.BorrowMoney;
import src.FinancialSystem.Connection;
import src.FinancialSystem.OtherExpenditure;
import src.FinancialSystem.OtherIncome;
import src.FinancialSystem.Salary;

/**
 * Servlet implementation class TellersystemUpdateServlet
 */
@WebServlet("/TellersystemUpdateServlet")
public class TellersystemUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TellersystemUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String category = request.getParameter("category");
		String department = request.getParameter("department");
		String id = request.getParameter("app_id");
		
		request.setAttribute("x", category);
		request.setAttribute("y", department);
		request.setAttribute("z", id);
		
			request.getRequestDispatcher("TellerSystemUpdate.jsp").forward(request, response);
	}
			
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
