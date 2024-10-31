<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<style>
body{
background-image:url(bg.jpg);
background-repeat:no-repeat;
 background-size: cover;
   background-position: center;
}

</style>
<body>
<%@include file="navbar.jsp" %>
<div>
<div class="d-flex justify-content-center flex-wrap">
<div class=" mt-3 " style="width: 24rem;">
<h1 class="text-center  p-3 bg-warning text-white">Wel Come Our<br> Web Applications</h1>
</div>
</div>


<div class="d-flex justify-content-center flex-wrap">

<div class="card m-3 shadow" style="width: 18rem;">
<h1 class="text-center  bg-danger text-white">Quiz Practices</h1>
  <img src="quiz_time.png" class="card-img-top" alt="..." style="width:100%; height:200px">
  <div class="card-body">
   <div class="d-grid gap-2">    
 <a href="u_Quiz_list.jsp" class="btn btn-primary" >Click Here</a>
</div>
  </div>
</div>

<div class="d-flex justify-content-center flex-wrap">
<div class="card m-3 shadow" style="width: 18rem;">
<h1 class="text-center  bg-danger text-white">Calculator</h1>
  <img src="calculator.png" class="card-img-top" alt="..." style="width:100%; height:200px">
  <div class="card-body">
   <div class="d-grid gap-2">    
 <a href="calculator.jsp" class="btn btn-primary" >Click Here</a>
</div>
  </div>
</div>

<div class="d-flex justify-content-center flex-wrap">
<div class="card m-3 shadow" style="width: 18rem;">
<h1 class="text-center  bg-danger text-white">Image</h1>
  <img src="nature.jpg" class="card-img-top" alt="..." style="width:100%; height:200px">
  <div class="card-body">
   <div class="d-grid gap-2">    
 <a href="image.jsp" class="btn btn-primary" >Click Here</a>
</div>
  </div>
</div>

</div>


</div>
</body>
</html>