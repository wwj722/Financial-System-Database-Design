package ExamplePackage;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.FinancialSystem.BorrowCheck;
import src.FinancialSystem.Connection;
import src.FinancialSystem.OtherExpenditureCheck;
import src.FinancialSystem.OtherIncomeCheck;
import src.FinancialSystem.SalaryCheck;

/**
 * Servlet implementation class CheckedSearchServlet
 */
@WebServlet("/CheckedSearchServlet")
public class CheckedSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckedSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	Connection conn = new Connection();
	try {
		List<SalaryCheck> x = conn.ViewSalaryCheck(true);
		List<BorrowCheck> y = conn.ViewBorrowCheck(true);
		List<OtherIncomeCheck> m = conn.ViewOtherIncomeCheck(true);
		List<OtherExpenditureCheck> n = conn.ViewOtherExpenditureCheck(true);
		boolean status = true;
		
		request.setAttribute("list1", x);
		request.setAttribute("list2", y);
		request.setAttribute("list3", m);
		request.setAttribute("list4", n);
		request.setAttribute("status", status);
		
		request.getRequestDispatcher("CheckView.jsp").forward(request, response);
		
		
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
