package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Student;


public class StudentDao {
private Connection con;

public StudentDao(Connection con){
	this.con=con;
}

public boolean saveStudent(Student student) {
	boolean f=false;
	String q="insert into Student values(name, email, address, password)(?,?,?,?)";
	try {
		PreparedStatement psmt=con.prepareStatement(q);
		psmt.setString(1, student.getName());
		psmt.setString(2, student.getEmail());
		psmt.setString(3, student.getAddress());
		psmt.setString(4, student.getPassword());
		psmt.executeUpdate();
		f=true;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return f;
}

public Student StudentByEmailAndPassword(String email, String password) {

	String q="select *from Student where email=? and password=?";
	Student student=null;
	try {
		PreparedStatement psmt=con.prepareStatement(q);
		psmt.setString(1, email);
		psmt.setString(2, password);
ResultSet rs=	psmt.executeQuery();

if(rs.next()) {
student=new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
}
	}catch(Exception e) {
		e.printStackTrace();
	}
return student;
}

}
