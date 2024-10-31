<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.* " %>
    
     <%
    if(request.getParameter("submit")!=null){
    	
    	  String id=request.getParameter("d");
    	  String tname=request.getParameter("n");
    	
    	String question=request.getParameter("question");
    	String op1=request.getParameter("op1");
    	String op2=request.getParameter("op2");
    	String op3=request.getParameter("op3");
    	String op4=request.getParameter("op4");
    	String ans=request.getParameter("ans");

    	
    	Class.forName("com.mysql.cj.jdbc.Driver"); 
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
    
    	PreparedStatement psmt=con.prepareStatement("update "+tname+" set Q=?, op1=?, op2=?, op3=?, op4=?, ans=? where id=?");
    	psmt.setString(1,question);
    	psmt.setString(2, op1);
    	psmt.setString(3, op2);
    	psmt.setString(4, op3);
    	psmt.setString(5, op4);
    	psmt.setString(6,ans);
        psmt.setString(7, id);
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
<title>Admin Quiz Update</title>
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
<%@include file="navbar.jsp" %>
 <%
 Class.forName("com.mysql.cj.jdbc.Driver"); 
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3300/Quiz", "root", "root");
	  String id=request.getParameter("d");
	  String tname=request.getParameter("n");
	  String table_name=tname.toUpperCase();
	  Statement smtp=con.createStatement();
	  ResultSet res=smtp.executeQuery("select *from "+tname+" where id="+id);
      while(res.next()){ 
%>

<div  class="update container card border-0 shadow">
<h1 class="text-center">Update <%=table_name %> Question</h1>
<form action="#" method="post">

Question<input class="form-control my-1 py-2" type="text" name="question" placeholder="Enter your name" value="<%= res.getString("q") %>">
Option 1<input class="form-control my-1 py-2" type="text"  name="op1" value="<%= res.getString("op1") %>">
Option 2<input class="form-control my-1 py-2" type="text"  name="op2" value="<%= res.getString("op2") %>">
Option 3<input class="form-control my-1 py-2" type="text"  name="op3" value="<%= res.getString("op3") %>">
Option 4<input class="form-control my-1 py-2" type="text" name="op4" value="<%= res.getString("op4") %>">
Answer<input class="form-control my-1 py-2" type="text"   name="ans" value="<%= res.getString("ans") %>">
<%
      }
      
%>

<button type="submit" class="btn btn-primary mt-2" value="submit" name="submit">submit</button>


</form>
</div>

</body>
</html>