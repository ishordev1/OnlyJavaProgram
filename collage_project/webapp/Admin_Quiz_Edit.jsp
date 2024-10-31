<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <%@page import="java.sql.*" %>
    
     <%
     String name=request.getParameter("name");
     int i=1;
    if(request.getParameter("submit")!=null){
    	String tname=(String)session.getAttribute("name");
    	String question=request.getParameter("question");
    	String op1=request.getParameter("op1");
    	String op2=request.getParameter("op2");
    	String op3=request.getParameter("op3");
    	String op4=request.getParameter("op4");
    	String ans=request.getParameter("ans");
    	Class.forName("com.mysql.cj.jdbc.Driver"); 
    	
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
    	
    	PreparedStatement psmt=con.prepareStatement("insert into "+tname+"(Q, op1, op2, op3, op4, ans ) values(?, ?,?, ?, ?,?)");
    	psmt.setString(1,question);
    	psmt.setString(2, op1);
    	psmt.setString(3, op2);
    	psmt.setString(4, op3);
    	psmt.setString(5,op4);
    	psmt.setString(6,ans);
    	psmt.executeUpdate();
   %>  
     <script>
    alert("record addadded");
    </script>	
   <% 	
    }  
    %>  

<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Quiz Edit</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>
<%@include file="navbar.jsp" %>
<h4 class=" m-1 p-2 text-center"><%=name%> Quiz Questions</h4>
<div class="m-1 p-2">
<div class="row">
<!-- Add Quiz Question ............................... -->
    <div class="col-2  ">
<form action="#" >
<h3 class="text-center">Add <%=name %> Questions</h3>
<div class="form-grounp mt-2">

<label for="nameField">Question </label>
<input type="text" class="form-control" name="question" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Option 1 </label>
<input type="text" class="form-control" name="op1" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Option 2 </label>
<input type="text" class="form-control" name="op2" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Option 3</label>
<input type="text" class="form-control" name="op3" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Option 4 </label>
<input type="text" class="form-control" name="op4" placeholder="enter here">
</div>

<div class="form-grounp mt-2">
<label for="nameField">Answer </label>
<input type="text" class="form-control" name="ans" placeholder="enter here">
</div>

<div class="container text-center mt-3">
<button type="submit" name="submit" value="submit" class="btn btn-primary">Add</button>
 <button type="reset" value="reset" name="reset" class="btn btn-primary">Reset</button>
</div>
<%session.setAttribute("name", name); %>
</form>
    
    
    </div>
    <!-- show Quiz Question ................................ -->
    <div class="col-10">
    <table class="table">
  <thead>
    <tr>
      <th scope="col">Sno.</th>
      <th scope="col">Question</th>
      <th scope="col">op1</th>
      <th scope="col">op2</th>
       <th scope="col">op3</th>
        <th scope="col">op4</th>
         <th scope="col">answer</th>
         <th scope="col">Delete</th>
         <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>  
<%
try{
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
Statement smtp=con.createStatement();
ResultSet res=smtp.executeQuery("select *from "+name);
while(res.next()){ 
%>
    <tr>
      <th><%=i %></th>
      <td><%= res.getString(2) %></td>
      <td> <%=res.getString(3) %></td>
      <td> <%=res.getString(4) %></td>
     <td> <%=res.getString(5) %></td>
      <td> <%=res.getString(6) %></td>
      <td> <%=res.getString(7) %></td>
      
      <!-- passing the 2 value in the url table name and column id............................... -->
      
      <td><a href='Admin_Quiz_Delete.jsp?d=<%=res.getString("id")%>&n=<%= request.getParameter("name") %>'>
		       <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
  <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
  <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
</svg></a></td>
  
<td><a href='Admin_Quiz_Update.jsp?d=<%= res.getString("id")%>&n=<%= request.getParameter("name") %>'>
<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
</svg>
</a></td>
     
    </tr>
<% i++;}
}
catch(Exception e){
	System.out.println(e);
}
%>

 </tbody>
</table>
    </div>
  </div>
  </div>
  
</body>
</html>