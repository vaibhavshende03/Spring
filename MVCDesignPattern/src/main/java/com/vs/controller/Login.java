package com.vs.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vs.DAO.DbConnection;
import com.vs.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try {
			Connection connection=DbConnection.getConnection();
			String query="select * from register where email=? and password=?";
			
			PreparedStatement pstm=connection.prepareStatement(query);
			pstm.setString(1, email);
			pstm.setString(2, password);
			
			ResultSet rs=pstm.executeQuery();
			
			if (rs.next()) {
				User user=new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				HttpSession session=request.getSession();
				session.setAttribute("Session_User", user);
				
				RequestDispatcher rd=request.getRequestDispatcher("/profile.jsp");
				rd.forward(request, response);
 			}
			else {
				out.print("<h3 style='color:red'>Email Id and Password didn't match </h3>");
				RequestDispatcher rd=request.getRequestDispatcher("/login.html");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
