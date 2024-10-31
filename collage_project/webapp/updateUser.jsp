<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*, collage_project.DBconnection" %>
    
     <%
    if(request.getParameter("submit")!=null){
    	
    	int n=Integer.parseInt(request.getParameter("d"));
    	String name=request.getParameter("user_name");
    	String password=request.getParameter("user_password");
    	String email=request.getParameter("user_email");
    	String course=request.getParameter("user_course");
    	String gender=request.getParameter("user_gender");
    	String vip=request.getParameter("vip");
    	
    	if(request.getParameter("vip")==""){
    		vip=null;
    	}
    	System.out.println(vip);
    	Connection con=DBconnection.getcon();
    	PreparedStatement psmt=con.prepareStatement("update user set name=?, password=?, email=?, course=?, gender=?, vip=? where id=?");
    	psmt.setString(1,name);
    	psmt.setString(2, password);
    	psmt.setString(3, email);
    	psmt.setString(4, course);
    	psmt.setString(5,gender);
    	psmt.setString(6, vip);
        psmt.setInt(7, n);
       psmt.executeUpdate();
    	
   %>
    <script>
    alert("record update");
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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
*{
margin:0px;
padding:0px;
}
.update{
padding:5px;

margin:auto;
width:40%;
}
</style>


<body>
 <%
       Connection con=DBconnection.getcon();
	  PreparedStatement psmt=con.prepareStatement("select *from user where id=?");
	
	  String n=request.getParameter("d");
	  psmt.setString(1,n);
      ResultSet res=psmt.executeQuery();
      while(res.next()){ 
%>

<div  class="update container card border-0 shadow">
<h1 class="text-center">Update Here</h1>
<form action="#" method="post">

Name<input class="form-control my-1 py-2" type="text" name="user_name" placeholder="Enter your name" value="<%= res.getString("name") %>">
Email<input class="form-control my-1 py-2" type="email" placeholder="Enter your email" name="user_email" value="<%= res.getString("email") %>">
Password<input class="form-control my-1 py-2" type="text" placeholder="password" name="user_password" value="<%= res.getString("password") %>">
course<input class="form-control my-1 py-2" type="text" placeholder="course" name="user_course" value="<%= res.getString("course") %>">
Gender<input class="form-control my-1 py-2" type="text" placeholder="course" name="user_gender" value="<%= res.getString("gender") %>">
make admin<input class="form-control my-1 py-2" type="text" placeholder="course" name="vip" value="<%= res.getString("vip") %>">
<%
      }
%>

<button type="submit" class="btn btn-primary mt-2" value="submit" name="submit">submit</button>
<a href="user.jsp" class="btn btn-primary mt-2"  >Go Back</a>

</form>
</div>

</body>
</html>