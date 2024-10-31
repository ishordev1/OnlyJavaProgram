<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>${user.getName()}</h1>
<h1>${user.getEmail()}</h1>

<h1>${user.address.getCity()}</h1>

</body>
</html>