package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
public static void main(String [] args ){
	try {
		//load the driver
//		Class.forName("com.mysql.jdbc.Driver");
		
	// create the connection.....
		String user="root";
		String password="root";
		String url="jdbc:mysql://localhost:3300/jdbc";
       Connection con=DriverManager.getConnection(url, user, password);
       Statement smt=con.createStatement();
       smt.executeUpdate("create table student(name varchar(20))");
       
System.out.println("table created");
con.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

