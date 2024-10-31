<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%
Class.forName("com.mysql.cj.jdbc.Driver"); 
    String name=(String)session.getAttribute("name");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
Statement smtp=con.createStatement();
ResultSet res=smtp.executeQuery("select id , ans, Q from "+name);

int i=1, count=0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>
<%@include file="navbar.jsp" %>
<h1 class="text-center mt-2">Check Your Answer</h1>
<%while(res.next()){ %>
<% String ans=request.getParameter(res.getString(1)); %>
<div class=" m-3 card text-bg-info mb-3" style="max-width: 40rem;">
  <div class="card-header"><%= i+").   "+ res.getString(3) %></div>
  <div class="card-body">
    <p class="card-text">
<b>your answer: </b><%= ans%><br>
<b class="text-warning">Answer: </b> <%= res.getString(2) %><br>
    </p>
  </div>
</div>

<%
if(ans !=null){
if(ans.equalsIgnoreCase(res.getString(2))){
	count++;
}
}
%>
<%i++; } %>
<h2 class="m-4">Total correct:  <%= count %></h2>
</body>
</html>