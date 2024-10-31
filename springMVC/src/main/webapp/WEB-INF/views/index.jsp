<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index page</title>
</head>
<body>
<h1>This is testing</h1>
<h1>${time }</h1>
<hr>
<c:forEach var="item" items="${list}">
<h1>hello</h1>
<p>${item}</p>
</c:forEach>
</body>
</html>