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
<h2  class="text-center m-3">Select Quiz Questions</h2>
<div class="d-flex justify-content-center flex-wrap">
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
 <a href="u_show_Quiz.jsp?name=<%= rs.getString(1) %>" class="btn btn-primary" >Click Here</a>
</div>
  </div>
</div>

<%

} %>


</div>
</body>
</html>