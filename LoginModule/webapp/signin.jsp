<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="Component/bootstrap.jsp" %>
</head>
<body>
<%@include file="Component/nav.jsp" %>

<div class="container">
<div class="row mt-5">
<div class="col-md-4 offset-md-4">

<div class="card">
<div class="container text-center">
<h3>signin Here</h3>
</div>
<div class="card-body">
<form action="signinServlet" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
</div>
</form>

</div>
</div>

</div>
</div>
</div>

</body>
</html>