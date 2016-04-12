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
 * Servlet implementation class TellerSearchServlet
 */
@WebServlet("/TellerSearchServlet")
public class TellerSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TellerSearchServlet() {
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
		Connection conn = new Connection();
		String startDate = request.getParameter("start");
		String endDate = request.getParameter("end");
		String category = request.getParameter("category");
		String department = request.getParameter("department");
		request.setAttribute("category", category);
		request.setAttribute("start", startDate);
		request.setAttribute("end", endDate);
		request.setAttribute("department", department);
		request.setAttribute("keyword", keyword);
		try {

			if (category.equals("salary")) {

				List<Salary> one = conn.ViewSalary(startDate, endDate,
						department, keyword);
				request.setAttribute("tellList", one);

				request.getRequestDispatcher("TellerSalarySearch.jsp").forward(
						request, response);

			} else if (category.equals("OtherExpenditure")) {

				List<OtherExpenditure> one = conn.ViewOtherExpenditure(
						startDate, endDate, department, keyword);
				request.setAttribute("tellList", one);
				request.getRequestDispatcher("TellerOtherExSearch.jsp")
						.forward(request, response);
			} else if (category.equals("OtherIncome")) {
				List<OtherIncome> one = conn.ViewOtherIncome(startDate,
						endDate, department, keyword);
				request.setAttribute("tellList", one);
				request.getRequestDispatcher("TellerOtherInsearch.jsp")
						.forward(request, response);
			} else if (category.equals("BorrowMoney")) {
				List<BorrowMoney> one = conn.ViewBorrowMoney(startDate,
						endDate, department, keyword);
				request.setAttribute("tellList", one);
				request.getRequestDispatcher("TellerBorrowSearch.jsp").forward(
						request, response);
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
