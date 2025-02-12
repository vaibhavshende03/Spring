package com.vs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.vs.DAO.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String city = req.getParameter("city");

		try {

			Connection con = DbConnection.getConnection();
			String insertQuery = "Insert Into register values(?,? ,?, ?)";
			PreparedStatement pstm = con.prepareStatement(insertQuery);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);
			pstm.setString(4, city);

			int rowsAffected = pstm.executeUpdate();

			if (rowsAffected > 0) {
				out.println("<h3 style='color:green'>Registered Succesfully</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			} else {
				out.println("<h3 style='color:Red'>Registration Failed</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.html");
				rd.include(req, resp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
