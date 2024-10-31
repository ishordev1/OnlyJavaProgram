<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>simple calculator</title>
</head>

<body>
<%@include file="navbar.jsp" %>
<form action="cal_backend.jsp" method="post">
<div class="row justify-content-md-center mt-4">
<div class="col-md-3 align-middle p-4 border-0 shadow">

<div class="form-grounp mt-2">
<label for="nameField">Number 1</label>
<input type="number" class="form-control" name="n1" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
+<input type="radio" value="add" name="op"> &nbsp; 
-<input type="radio" value="sub" name="op"> &nbsp; 
*<input type="radio" value="mul" name="op"> &nbsp; 
/<input type="radio" value="div" name="op"> &nbsp; 
</div>

<div class="form-grounp mt-2">
<label for="nameField">Name </label>
<input type="number" class="form-control" name="n2" placeholder="enter here">
</div>

<button class="btn btn-primary mt-4" type="submit" name="submit" value="submit">Submit</button>
</div>
</div>
</form>
</body>
</html>