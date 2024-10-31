<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.sql.*, collage_project.DBconnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signin</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style>
*{
margin:0px;
padding:0px;
}

body{
background-image:url(bg.jpg);
background-repeat:no-repeat;
 background-size: cover;
   background-position: center;}
</style>

<body>
<section>
<div class="container mt-5 pt-5">
<div class="row">
<div class="col-12 col-sm-8 col-md-4 m-auto">
<div class="card border-3 shadow">
<div class="card-body">
<h1 class="text-center">login Here</h1>

<form action="#" method="post">
<input type="text" name="user_email" class="form-control my-4 py-2" placeholder="Enter your email">
<input type="text" name="user_password" class="form-control my-4 py-2" placeholder="Enter your password">
<div class="text-center mt-3">
<button type="submit" value="submit" name="submit" class="btn btn-primary">login</button>
<a href="signup.jsp" class="nav-link">create Account ?</a>
</div>

</form>

</div>
</div>
</div>
</div>
</div>
</section>
</body>

  <%
    if(request.getParameter("submit")!=null){
    	String email=request.getParameter("user_email");
    	String password=request.getParameter("user_password");
     
  	 Connection con=DBconnection.getcon();
    	PreparedStatement psmt=con.prepareStatement("select name, vip from user where email=? and password=?");
    	psmt.setString(1,email);
    	psmt.setString(2, password);
    	
    	ResultSet res=psmt.executeQuery();
    	
    	
     if(res.next()){
    	 
    	// session tracking use Httpsession   
    	 HttpSession sess=request.getSession();
    	 sess.setAttribute("check_session","ishor" );
    	 
    if(res.getString("vip")==null){
    	response.sendRedirect("home.jsp");
    }
    else{
    	response.sendRedirect("admin_page.jsp");
    }
    	 
      }
    
   else{
  %>
<script>
    alert("Please create account...?");
    </script>
  <% 
	
 }
 
    }  
    %>
</html>