package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;
public static Connection getConnection() {
	try {
		if(con==null) {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "root");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
