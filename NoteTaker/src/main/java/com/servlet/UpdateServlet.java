package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class UpdateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			Session s=FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			int id=Integer.parseInt(request.getParameter("noteid").trim());
			
			//if we fetch data then it going presissent stage where if change then it automatic change in database and session
			
			Note notes=s.get(Note.class, id);
			notes.setTitle(title);
			notes.setContent(content);
			notes.setAddedDate(new Date());
			tx.commit();
			s.close();
			response.sendRedirect("all_notes.jsp");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
