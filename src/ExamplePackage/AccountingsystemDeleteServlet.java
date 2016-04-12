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
import src.FinancialSystem.DebtRecords;
import src.FinancialSystem.OtherExpenditure;
import src.FinancialSystem.OtherIncome;
import src.FinancialSystem.OtherRecords;
import src.FinancialSystem.Salary;
import src.FinancialSystem.SalaryRecords;

/**
 * Servlet implementation class AccountingsystemDeleteServlet
 */
@WebServlet("/AccountingsystemDeleteServlet")
public class AccountingsystemDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountingsystemDeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String category = request.getParameter("category");
		String keyword = request.getParameter("keyword");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String department = request.getParameter("department");
		int id = Integer.valueOf(request.getParameter("app_id"));

		Connection conn = new Connection();
		conn.DeleteAccounting(id);

		try {

			if (category.equals("SalaryRecords")) {

				List<SalaryRecords> x = conn.ViewSalaryRecords(start, end,
						department, keyword);
				request.setAttribute("tellList", x);
				request.getRequestDispatcher("AccountingSalarySearch.jsp")
						.forward(request, response);
			}

			else if (category.equals("OtherRecords")) {

				List<OtherRecords> x = conn.ViewOtherRecords(start, end,
						department, keyword);
				request.setAttribute("tellList", x);
				request.getRequestDispatcher("AccountingOtherRecordsSearch.jsp")
						.forward(request, response);

			}

			else if (category.equals("DebtRecords")) {

				List<DebtRecords> x = conn.ViewDebtRecords(start, end,
						department, keyword);
				request.setAttribute("tellList", x);
				request.getRequestDispatcher("AccountingOtherRecords.jsp")
						.forward(request, response);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
