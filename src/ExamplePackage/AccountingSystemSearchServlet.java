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
 * Servlet implementation class AccountingSystemSearchServlet
 */
@WebServlet("/AccountingSystemSearchServlet")
public class AccountingSystemSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountingSystemSearchServlet() {
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
		String keyword = request.getParameter("keyword");
		String startDate = request.getParameter("start");
		String endDate = request.getParameter("end");
		String category = request.getParameter("category");
		String department = request.getParameter("department");
		request.setAttribute("category", category);
		request.setAttribute("start", startDate);
		request.setAttribute("end", endDate);
		request.setAttribute("department", department);
		request.setAttribute("keyword", keyword);
		Connection conn = new Connection();
		try {

			if (category.equals("SalaryRecords")) {

				List<SalaryRecords> one = conn.ViewSalaryRecords(startDate,
						endDate, department, keyword);
				request.setAttribute("tellList", one);

				request.getRequestDispatcher("AccountingSalarySearch.jsp")
						.forward(request, response);

			} else if (category.equals("DebtRecords")) {

				List<DebtRecords> one = conn.ViewDebtRecords(startDate,
						endDate, department, keyword);
				request.setAttribute("tellList", one);
				request.getRequestDispatcher("AccountingDebtRecordsSearch.jsp")
						.forward(request, response);
			} else if (category.equals("OtherRecords")) {
				List<OtherRecords> one = conn.ViewOtherRecords(startDate,
						endDate, department, keyword);
				request.setAttribute("tellList", one);
				request.getRequestDispatcher("AccountingOtherRecordsSearch.jsp")
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
