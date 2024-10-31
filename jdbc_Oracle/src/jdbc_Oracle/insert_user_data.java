package jdbc_Oracle;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insert_user_data {
public static void main(String[] args) {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="root";
		Connection con=DriverManager.getConnection(url,username, password);
		
		PreparedStatement psmt=con.prepareStatement("insert into student values(?, ?,?)");
		while(true) {
			System.out.println("Enter the id");
			int id=Integer.parseInt(input.readLine());
			
			System.out.println("Enter the student name:");
		String name=input.readLine();
			
			System.out.println("Enter your branch:");
			String branch=input.readLine();
			
			psmt.setInt(1,id);
			psmt.setString(2, name);
			psmt.setString(3, branch);
			
			int count=psmt.executeUpdate();
			if(count>0) 
				System.out.println(count+" record inserted");
			
			else 
				System.out.println("no record inserted");
			
			System.out.println("Do you want to insert more records....[yes/no].....");
			
		String ch=input.readLine();
		
		if(ch.equalsIgnoreCase("no")) {
			break;
		}
		
			
			
		}
con.close();   

	}
catch(Exception e) {
	System.out.println(e);
}

}
}
