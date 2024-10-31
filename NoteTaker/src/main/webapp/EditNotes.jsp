<%@page import="com.entities.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Notes</title>
<%@include file="alljs_css.jsp" %>
</head>
<body>
<div class="container">
<%@include file="navbar.jsp" %>
<h1>This is edit page</h1>


<%
int noteId=Integer.parseInt(request.getParameter("note_id").trim());
Session s=FactoryProvider.getFactory().openSession();
Transaction tx=s.beginTransaction();
Note note=s.get(Note.class, noteId);

%>
<br>
<!--this is form-->
<form action="UpdateServlet" method="post">
<input name="noteid" type="hidden" value="<%=note.getId()%>">

  <div class="form-group">
    <label for="title">Notes title</label>
    <input type="text" name="title" value="<%=note.getTitle() %>"
    required class="form-control" id="title">
  </div>
  <div class="form-group">
    <label for="content" >Note Content</label>
    <textarea id="content" name="content" class="form-control" style="height:250px" > <%=note.getContent() %></textarea>
  </div>
  
 <div class="container text-center">
  <button type="submit" class="btn btn-success">Save your note</button>
 </div>
</form>
<!-- end form -->

</div>
</body>
</html>