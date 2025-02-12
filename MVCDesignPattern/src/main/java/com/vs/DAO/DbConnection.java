package com.vs.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db","root","Admin@123");
			
			
			
		} catch (SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
		
		
	}

}
