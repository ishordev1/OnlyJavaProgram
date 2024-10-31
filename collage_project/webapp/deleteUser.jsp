<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*, collage_project.DBconnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Connection con=DBconnection.getcon();
Statement smtp=con.createStatement();
String id=request.getParameter("d");

smtp.executeUpdate("delete from user where id='"+id+"'");
response.sendRedirect("user.jsp");

%>
<body>

</body>
</html>