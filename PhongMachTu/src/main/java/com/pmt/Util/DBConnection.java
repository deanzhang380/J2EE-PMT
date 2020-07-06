package com.pmt.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static private String db_URLString = "jdbc:mysql://host1:3306/";
	static private String db_dbName = "phongmachtu";
	static private String db_NameString = "root";
	static private String db_pasString = "admin";
	static private String db_driverString = "org.mysql.jbdc.Driver";
	
	public static Connection getConnection () {
		
		Connection con = null;
		
		try {
			Class.forName(db_driverString);
			con = DriverManager.getConnection(db_URLString + db_dbName, db_NameString, db_pasString);
			
			return con;
			
		} catch (SQLException | ClassNotFoundException e) {
			
			System.out.println("Cant get connection to the database.");
			
			return null;
		}
	}
}
