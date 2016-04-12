package ExamplePackage;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ExamplePackage.Userinformation;
import src.FinancialSystem.Connection;

/**
 * Servlet implementation class TellerCreateBorrowServlet
 */
@WebServlet("/TellerCreateBorrowServlet")
public class TellerCreateBorrowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TellerCreateBorrowServlet() {
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
	String deadline = request.getParameter("deadline");
	String date = request.getParameter("date");
	float interestRate = Float.valueOf(request.getParameter("interestRate"));
	int id = Integer.valueOf(Userinformation.id);

	Connection conn = new Connection();
	try {
		
		conn.CreateBorrowMoney(date, name, amount, department, id, deadline, interestRate);
		
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
