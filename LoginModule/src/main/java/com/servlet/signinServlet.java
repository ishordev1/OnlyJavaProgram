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



public class signinServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
	
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			StudentDao dao=new StudentDao(ConnectionProvider.getConnection());
			Student st=dao.StudentByEmailAndPassword(email,password);
			if(st==null) {
				out.println("sorry Student not found");
			}
			else {
				out.println(st.getName());
			}


		
		
		
	}

}
