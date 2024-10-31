package jdbc_Oracle;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class upload_image {
	public static void main(String[] args) {
		
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
		String jdbc_username="system";
		String jdbc_password="root";
		Connection con=DriverManager.getConnection(jdbc_url,jdbc_username, jdbc_password);
		PreparedStatement psmt=con.prepareStatement("insert into image values(?)");
		
		
		
		//image...............................
		
		//swing method
		JFileChooser jfc=new JFileChooser();
		jfc.showOpenDialog(null);
		
//		File f=new File("C:\\Users\\Thakur Enterprises\\Pictures\\Background image\\qq.jpg");
		File f=jfc.getSelectedFile();
		FileInputStream fin=new FileInputStream(f);
		psmt.setBinaryStream(1,fin,fin.available());
		psmt.executeUpdate();
		JOptionPane.showMessageDialog(null, "success");
		System.out.println("done...........");
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	}
}
