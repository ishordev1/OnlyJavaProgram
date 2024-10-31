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
   response.sendRedirect("user.jsp");
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

<%@include file="navbar.jsp" %>
<form action="#" >
<div class="row">
<div class="col-md-3 p-4">
<!-- first col who kept 6 column -->
<h3>Add information</h3>

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
<button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg">Add User</button>
 <button type="reset" value="reset" name="reset" class="btn btn-primary btn-lg">Reset</button>
</div>

</div>
</form>

<!-- second div -->
<div class="col-md-8 p-2">
<h3 class="text-center">Your all User</h3>
<div>

<table class="table">
  <thead>
    <tr>
      <th scope="col">SNo.</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
       <th scope="col">Gender</th>
        <th scope="col">Course</th>
        <th scope="col">Delete</th>
         <th scope="col">Edit</th>  
    </tr>
  </thead>
  <tbody>
  
  <%
try{
	
	  Connection con=DBconnection.getcon();
	   Statement smt=con.createStatement();
	   ResultSet rs=smt.executeQuery("select *from user");
	   int i=1;
	   while(rs.next()){
		   
		   %>
		   <tr>
		       <td><%=i %></td>
		       <td><%=rs.getString(2) %></td>
		       <td><%=rs.getString(5) %></td>
		       <td><%=rs.getString(4) %></td>
		      <td><%=rs.getString(6) %></td>
		       <td><%=rs.getString(3) %></td>
		    
		       <td><a href='deleteUser.jsp?d=<%=rs.getString("id") %>'>
		       <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
  <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
  <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
</svg>
  </a></td>  
<td><a href='updateUser.jsp?d=<%= rs.getString("id")%>'>
<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
</svg>
</a></td>

</tr>                    
		   <% 
		   
	i++;
	   }
	}
	catch(Exception e){
	System.out.println(e);
	}

%>
 
  </tbody>
</table>
</div>
</div>


</body>
</html>