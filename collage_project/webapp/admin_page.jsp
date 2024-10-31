<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Admin page</title>
</head>
<style>
.con{
width:90%;
margin:auto;
display:flex;
flex-wrap:wrap;
justify-content:center;
}
.aa{
width:300px;
height:200px;
margin:5px;
padding:4px;
}
.aa img {
width:100%;
height:80%;
}

</style>
<body>
<%@include file="navbar.jsp" %>
<h1 class="text-center">Admin Page</h1>
<div class="con mt-3">
<div class="aa shadow">
<img src="user.png">
<div class="d-grid gap-2">
  <a href="user.jsp" class="btn btn-primary" >Show User</a>
</div>
</div>

<div class="aa shadow">
<img src="quiz.jpg">
<div class="d-grid gap-2">
   <a href="Admin_Quiz.jsp" class="btn btn-primary" >Add Quiz Question</a>
</div>
</div>
</div>
</body>
</html>