package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Entity.Student;

public class StudentDao {
private	Connection con;

public StudentDao(Connection con){
	this.con=con;
}

public boolean insertStudent(Student student) {
	boolean f=false;
	String q="insert into student values(name, address, phone)(?,?,?)";
	try {
		PreparedStatement psmt=con.prepareStatement(q);
		psmt.setString(1, student.getName());
		psmt.setString(2, student.getAddress());
		psmt.setString(3, student.getPhoneNo());
		psmt.executeUpdate();
		f=true;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return f;
}




}
