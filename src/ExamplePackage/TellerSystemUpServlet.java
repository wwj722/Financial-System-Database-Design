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
 * Servlet implementation class TellerSystemUpServlet
 */
@WebServlet("/TellerSystemUpServlet")
public class TellerSystemUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TellerSystemUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		int amount = Integer.valueOf(request.getParameter("amount"));
		int id = Integer.valueOf(request.getParameter("id"));
		String type = request.getParameter("category");

		Connection conn = new Connection();
			
			try {
				conn.UpdateTeller(id, name, amount, date, type);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("Tellerupdatesuccess.jsp").forward(request, response);}
			
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
