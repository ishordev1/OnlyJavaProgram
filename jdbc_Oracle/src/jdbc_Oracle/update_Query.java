package jdbc_Oracle;

import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class update_Query {
public static void main(String[] args) {
	InputStreamReader br=new InputStreamReader(System.in);
	BufferedReader input=new BufferedReader(br);
try {

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

	
	Statement smt=con.createStatement();
	
	System.out.println("Enter your id:");
//	String value=input.readLine();
//	int id=Integer.parseInt(value);
int id=Integer.parseInt(input.readLine());

System.out.println("Enter new name:");
String name=input.readLine();

int count=smt.executeUpdate("update student set name=' "+name+" ' where no="+id);
if(count>0) {
	System.out.println(count+"rows update");
}
else {
	System.out.println("no record found.");
}

}
catch(Exception e) {
	System.out.println(e);
}
}
	
}
