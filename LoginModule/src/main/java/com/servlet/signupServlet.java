package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.entity.Student;
import com.helper.ConnectionProvider;


public class signupServlet extends HttpServlet {
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
PrintWriter out=res.getWriter();
res.setContentType("text/html");
	String name=req.getParameter("name");
String email=req.getParameter("email");
String password=req.getParameter("password");
String address=req.getParameter("address");
StudentDao dao=new StudentDao(ConnectionProvider.getConnection());
Student st=new Student(name, email, address, password);

boolean b=dao.saveStudent(st);
if(b) {
	out.println("Student Details save successfully");
}
else {
	out.println("Sorry somethings went wrong");
}

}
}
