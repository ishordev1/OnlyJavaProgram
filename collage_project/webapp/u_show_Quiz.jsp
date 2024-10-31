<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <%@page import="java.sql.*" %>
    <%
Class.forName("com.mysql.cj.jdbc.Driver"); 
String name=request.getParameter("name");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
Statement smtp=con.createStatement();
ResultSet res=smtp.executeQuery("select *from "+name);
int i=1;
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>user show quiz</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>
<%@include file="navbar.jsp" %>
<h1 class=" m-3 p-2"><%= name.toUpperCase()%> Quiz Questions</h1>
<%while(res.next()){ 
%>
<form action="Quiz_marks.jsp" method="post">
<div class=" m-3 card text-bg-info mb-3" style="max-width: 60rem;">
  <div class="card-header"><%= i+").   "+ res.getString(2) %></div>
  <div class="card-body">
    <p class="card-text">
 <input type="radio" name="<%=res.getString(1) %>" value="<%=res.getString(3) %>"> <%=res.getString(3) %>&nbsp;  &nbsp;
<input type="radio" name="<%=res.getString(1) %>" value="<%=res.getString(4) %>"> <%=res.getString(4) %>&nbsp;  &nbsp;
<input type="radio" name="<%=res.getString(1) %>" value="<%=res.getString(5) %>" > <%=res.getString(5) %>&nbsp;  &nbsp;
<input type="radio" name="<%=res.getString(1) %>" value="<%=res.getString(6) %>"> <%=res.getString(6) %>&nbsp;  &nbsp;
    </p>
  </div>
</div>
<% i++;} %>
<button type="submit" class="m-4">Submit</button>
</form>
<!-- It session is used to show the result in Quiz_marks page -->
<% session.setAttribute("name", request.getParameter("name")); %>
</body>
</html>