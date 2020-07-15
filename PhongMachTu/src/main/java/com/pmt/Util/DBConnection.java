package com.pmt.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static private Connection con = null;
	
	public static Connection getConnection () {	
		
		try {
			String db_URLString = "jdbc:mysql://localhost:3306/";
			String db_dbName = "phongmachtu";
			String db_NameString = "root";
			String db_pasString = "admin";
			String db_driverString = "com.mysql.jbdc.Driver";
			
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			con = DriverManager.getConnection(db_URLString + db_dbName, db_NameString, db_pasString);
			
			return con;
			
		} catch (Exception e) { //SQLException | ClassNotFoundException
			
			System.out.println("Cant get connection to the database.");
			
			return null;
		}
	}
	
	public void disconnect() {
	    if (con != null) {
	        try {
	            con.close();
	            con = null;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
