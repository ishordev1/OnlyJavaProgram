package jdbc_Oracle;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class connection {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="root";
		Connection con=DriverManager.getConnection(url,username, password);
		
		Statement smt=con.createStatement();
		smt.executeUpdate("create table student(no number, name varchar(12), Branch char(10))");
		System.out.println("Table create successfully.....");
		
		
con.close();                                                                                                                             
		
//to check connection is created or not into a databases
//		if(con.isClosed()) {
//			System.out.println("Connection is closed");
//		}
//		else {
//			System.out.println("connected.");
//		}
//		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
