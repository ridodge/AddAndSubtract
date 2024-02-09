package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculate;

/**
 * Servlet implementation class getAddServlet
 */
@WebServlet("/getAddServlet")
public class getAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAdd1 = request.getParameter("userAdd1");
		String userAdd2 = request.getParameter("userAdd2");
		int val1 = Integer.parseInt(userAdd1);
		int val2 = Integer.parseInt(userAdd2);
		
		Calculate add = new Calculate(val1, val2);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(add.doAdditionString());
//		writer.close();
		
		request.setAttribute("addObject", add);
		getServletContext().getRequestDispatcher("/addresult.jsp").forward(request, response);
	}

}
