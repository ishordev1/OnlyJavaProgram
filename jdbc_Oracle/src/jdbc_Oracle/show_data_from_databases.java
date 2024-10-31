package jdbc_Oracle;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class show_data_from_databases {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="root";
		Connection con=DriverManager.getConnection(url,username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select *from student");
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String branch=rs.getString(3);
			System.out.println("your id no:"+id);
			System.out.println("Your name:"+name);
			System.out.println("your branch:"+branch);
			System.out.println("");
		}
	
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
