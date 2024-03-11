package com.workersTable;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WorkersTable")
public class WorkersTable extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Worker> dbDataList= new ArrayList();
					try {
						dbDataList = DBCalling.dbDataList();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
//		String[] dbDataList = {"apple","Banana"};

		request.setAttribute("dbDataList", dbDataList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		String useridString= request.getParameter("userid");
//		String passwordString=request.getParameter("password");
//		
//		User1 user1 = new User1(useridString, passwordString);
//		
//		try {
//			if (DBCalling.loginList(user1)) {
//				response.sendRedirect("Menu.jsp");
//			}
//			else {
//				response.sendRedirect("Login.jsp");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
//		dispatcher.forward(request, response);
	}

}