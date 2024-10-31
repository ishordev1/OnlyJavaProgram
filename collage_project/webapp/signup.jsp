<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
        <%@page import="java.sql.*, collage_project.DBconnection " %>
     <%
    if(request.getParameter("submit")!=null){
    	String name=request.getParameter("user_name");
    	String password=request.getParameter("user_password");
    	String email=request.getParameter("user_email");
    	String course=request.getParameter("user_course");
    	String gender=request.getParameter("user_gender");
  
    	 Connection con =DBconnection.getcon();
    	PreparedStatement psmt=con.prepareStatement("insert into user(name, course,password, email, gender ) values(?, ?,?, ?, ?)");
    	psmt.setString(1,name);
    	psmt.setString(2, course);
    	psmt.setString(3, password);
    	psmt.setString(4, email);
    	psmt.setString(5,gender);
    	psmt.executeUpdate();
    	
   %>
    <script>
    alert("record addadded");
    </script>	
   <% 	

    }  
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>


<form action="#" >
<div class="row justify-content-md-center">
<div class="col-md-3 align-middle p-4 shadow mt-3">
<!-- first col who kept 6 column -->
<h3>Signup Here</h3>

<div class="form-grounp mt-2">
<label for="nameField">Name </label>
<input type="text" class="form-control" name="user_name" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Password </label>
<input type="text" class="form-control" name="user_password" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Email </label>
<input type="text" class="form-control" name="user_email" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Course</label>
<input type="text" class="form-control" name="user_course" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Gender </label>
<input type="text" class="form-control" name="user_gender" placeholder="enter here">
</div>

<div class="container text-center mt-3">
<button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg">signup</button>
 <button type="reset" value="reset" name="reset" class="btn btn-primary btn-lg">Reset</button>
</div>
<a href="signin.jsp" class="nav-link text-center">SIGN IN ?</a>

</div>
</form>
</body>
</html>