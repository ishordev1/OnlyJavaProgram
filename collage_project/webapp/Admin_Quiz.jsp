<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>user show quiz</title>
</head>

<body>
<%@include file="navbar.jsp" %>
<h2  class="text-center m-3">Manage Quiz Questions</h2>
<div class="d-flex justify-content-center flex-wrap">

<div class="card m-3 " style="width: 18rem;">
<h1 class="text-center  bg-warning text-white">Add Quiz</h1>

  <svg xmlns="http://www.w3.org/2000/svg" width="100" height="130" fill="currentColor" class="bi bi-plus-circle-fill card-img-top" viewBox="0 0 16 16">
  <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3v-3z"/>
</svg>
  
  <div class="card-body">
   <div class="d-grid gap-2">
 <a href="A_create_Quiz.jsp" class="btn btn-primary" >Click Here</a>
</div>
  </div>
</div>

<%
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
Statement smt=con.createStatement();
ResultSet rs=smt.executeQuery("show tables");
while(rs.next()){
%>

<div class="card m-3" style="width: 18rem;">
<h1 class="text-center  bg-warning text-white"><%=rs.getString(1).toUpperCase() %></h1>
  <img src="quiz.jpg" class="card-img-top" alt="...">
  <div class="card-body">
   <div class="d-grid gap-2">    
 <a href="Admin_Quiz_Edit.jsp?name=<%= rs.getString(1) %>" class="btn btn-primary" >Add Question</a>
  <a href="Admin_Quiz_table_Delete.jsp?name=<%= rs.getString(1) %>" class="btn btn-primary" >Delete Quiz</a>
</div>
  </div>
</div>

<%
} %>


</div>
</body>
</html>