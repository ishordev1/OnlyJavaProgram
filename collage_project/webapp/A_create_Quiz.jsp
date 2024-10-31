<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
    <%
 if(request.getParameter("submit")!=null){
	 String name=request.getParameter("tname");
	 String tname=name.replaceAll("\\s", "");
	 if(tname !=""){
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");

String sql="create table "+tname+"(id int not null primary key auto_increment, Q varchar(100), op1 varchar(50), op2 varchar(50), op3 varchar(50), op4 varchar(50), ans varchar(50))";
Statement smt=con.createStatement();
System.out.println(tname);
smt.executeUpdate(sql);
%>
<script>
alert("table created successfully...")
</script>
 <% } 
 else{ 
 %>
<script>
alert("table not created....")
</script>		 
 
 <%} %>
<%} %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A create quiz table</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <style>
 .con{
 width:400px;
height:200px;
margin:auto;
padding:4px;
 }
 
 </style>
<body>
<%@include file="navbar.jsp" %>
<h1 class="text-center">Create Quiz table</h1>
<form action="#" >
<div class="d-flex justify-content-center flex-wrap">

<div class=" shadow card p-5" style="width: 25rem;">
<div>
 <label for="exampleInputEmail1" class="form-label text-center">Enter Table Name</label>
    <input type="text" class="form-control " name="tname" placeholder="Enter Here" >

 <button type="submit" name="submit" value="submit" class="btn bg-primary mt-3 text-white">Submit</button>
<a href="Admin_Quiz.jsp" class="btn bg-primary  mt-3 text-white">Go Back</a>
</div>
  </div>



</div>
</form>
</body>
</html>