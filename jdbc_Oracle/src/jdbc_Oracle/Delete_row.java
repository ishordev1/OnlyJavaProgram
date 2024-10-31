package jdbc_Oracle;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.BufferedReader;
public class Delete_row {
public static void main(String[] args) {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		
		while(true) {
			System.out.println("Enter the No of table:");
			int no=Integer.parseInt(input.readLine());
			int count=smt.executeUpdate("delete from student where no="+no);
			if(count>0) {
				System.out.println(count+"row Deleted.");
			}
			else {
				System.out.println("no record delecte");
			}
			System.out.println("Do you want to remove more record [yes/no] .....");
			String ch=input.readLine();
			if(ch.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		
		
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
