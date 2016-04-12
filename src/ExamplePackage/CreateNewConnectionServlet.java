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
 * Servlet implementation class CreateNewConnectionServlet
 */
@WebServlet("/CreateNewConnectionServlet")
public class CreateNewConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateNewConnectionServlet() {
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

		String department = request.getParameter("department");
		String category = request.getParameter("category");
		String start = request.getParameter("start");
		String end = request.getParameter("end");

		Connection conn = new Connection();
		try {
			request.setAttribute("category", category);
			request.setAttribute("department", department);
			request.setAttribute("start", start);
			request.setAttribute("end", end);
			if (category.equals("salarycheck")) {

				List<Salary> one = conn
						.SearchSalary(start, end, department, "");
				request.setAttribute("tellList1", one);

				List<SalaryRecords> two = conn.SearchSalaryRecords(start, end,
						department, "");
				request.setAttribute("tellList2", two);
				request.getRequestDispatcher("CheckoutSearch.jsp").forward(
						request, response);

			} else if (category.equals("OtherIncomeCheck")) {

				List<OtherIncome> one = conn.SearchOtherIncome(start, end,
						department, "");
				request.setAttribute("tellList1", one);

				List<OtherRecords> two = conn.SearchOtherRecords(start, end,
						department, "");
				request.setAttribute("tellList2", two);

				request.getRequestDispatcher("CheckoutSearch.jsp").forward(
						request, response);
			} else if (category.equals("BorrowCheck")) {

				List<BorrowMoney> one = conn.SearchBorrowMoney(start, end,
						department, "");
				request.setAttribute("tellList1", one);

				List<DebtRecords> two = conn.SearchDebtRecords(start, end,
						department, "");
				request.setAttribute("tellList2", two);

				request.getRequestDispatcher("CheckoutSearch.jsp").forward(
						request, response);
			}

			else if (category.equals("OtherExpenditureCheck")) {

				List<OtherExpenditure> one = conn.SearchOtherExpenditure(start,
						end, department, "");
				request.setAttribute("tellList1", one);

				List<OtherRecords> two = conn.SearchOtherRecords(start, end,
						department, "");
				request.setAttribute("tellList2", two);

				request.getRequestDispatcher("CheckoutSearch.jsp").forward(
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
