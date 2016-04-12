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
import ExamplePackage.Userinformation;

/**
 * Servlet implementation class CorrectServlet
 */
@WebServlet("/CorrectServlet")
public class CorrectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CorrectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	int tid = Integer.valueOf(request.getParameter("app1_id"));
	int aid = Integer.valueOf(request.getParameter("app2_id"));
	int uid = Integer.valueOf(Userinformation.id);
	String category = request.getParameter("category");	
	String start = request.getParameter("start");
	String end = request.getParameter("end");
	String department = request.getParameter("department");
	
	
	
	Connection conn = new Connection();
	
	if(category.equals("salarycheck")){
		try {
			conn.CreateSalaryCheck(tid, aid, true, uid);
			
			
			List<Salary> one = conn
					.SearchSalary(start, end, department, "");
			request.setAttribute("tellList1", one);

			List<SalaryRecords> two = conn.SearchSalaryRecords(start, end,
					department, "");
			request.setAttribute("tellList2", two);
			request.getRequestDispatcher("CheckoutSearch.jsp").forward(
					request, response);
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	else if(category.equals("OtherIncomeCheck")){
		try {
			conn.CreateOtherIncomeCheck(tid, aid, true, uid);
			
			List<OtherIncome> one = conn.SearchOtherIncome(start, end,
					department, "");
			request.setAttribute("tellList1", one);

			List<OtherRecords> two = conn.SearchOtherRecords(start, end,
					department, "");
			request.setAttribute("tellList2", two);

			request.getRequestDispatcher("CheckoutSearch.jsp").forward(
					request, response);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
		
		else if (category.equals("BorrowCheck")) try {
			
          conn.CreateBorrowCheck(tid, aid, true, uid);
			List<BorrowMoney> one = conn.SearchBorrowMoney(start, end,
					department, "");
			request.setAttribute("tellList1", one);

			List<DebtRecords> two = conn.SearchDebtRecords(start, end,
					department, "");
			request.setAttribute("tellList2", two);

			request.getRequestDispatcher("CheckoutSearch.jsp").forward(
					request, response);
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	

	else if (category.equals("OtherExpenditureCheck")) 
		try{
        conn.CreateOtherExpenditureCheck(tid, aid, true, uid);
		List<OtherExpenditure> one = conn.SearchOtherExpenditure(start,
				end, department, "");
		request.setAttribute("tellList1", one);

		List<OtherRecords> two = conn.SearchOtherRecords(start, end,
				department, "");
		request.setAttribute("tellList2", two);

		request.getRequestDispatcher("CheckoutSearch.jsp").forward(
				request, response);

	}catch (ParseException e) {
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
