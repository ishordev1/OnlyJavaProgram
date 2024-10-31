package collage_project;
import java.sql.*;
public class DBconnection {
static Connection con=null;
static {
	try {
Class.forName("com.mysql.cj.jdbc.Driver");	  
con=DriverManager.getConnection("jdbc:mysql://localhost:3300/collage", "root", "root");
}
catch(Exception e) {
	System.out.println("connection error");
	System.out.println(e);
}
}
public static Connection getcon() {
	return con; 
}
}