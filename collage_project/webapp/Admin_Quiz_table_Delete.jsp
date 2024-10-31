<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Quiz</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
Statement smtp=con.createStatement();
String tname=request.getParameter("name");
smtp.executeUpdate("drop table "+ tname);
%>
<script>
alert("Delete Quiz successfully.....")
</script>

</body>
</html>