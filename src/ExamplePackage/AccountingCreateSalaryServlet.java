package ExamplePackage;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.FinancialSystem.Connection;

/**
 * Servlet implementation class AccountingCreateSalaryServlet
 */
@WebServlet("/AccountingCreateSalaryServlet")
public class AccountingCreateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountingCreateSalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int amount = Integer.valueOf(request.getParameter("amount"));
		String department = request.getParameter("department");
		int takenby = Integer.valueOf(request.getParameter("takenby"));
		String date = request.getParameter("date");
		int id = Integer.valueOf(Userinformation.id);

		Connection conn = new Connection();
		try {
			
			conn.CreateSalaryRecords(date, name, amount, department, id, takenby);
			
			request.getRequestDispatcher("TellerCreateSuccess.jsp").forward(request, response);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
