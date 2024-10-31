<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add notes</title>
<%@include file="alljs_css.jsp" %>

</head>
<body>
<div class="container">
<%@include file="navbar.jsp" %>

<br>
<h1>Please fill your notes detail</h1>
<br>
<!--this is form-->
<form action="SaveNoteServlet" method="post">
  <div class="form-group">
    <label for="title">Notes</label>
    <input type="text" name="title" required class="form-control" id="title" placeholder="Enter Here">
  </div>
  
  <div class="form-group">
    <label for="content" >Notes Content</label>
    <textarea id="content" placeholder="Enter Here" name="content" class="form-control" style="height:250px"></textarea>
  </div>
  
 <div class="container text-center">
  <button type="submit" class="btn btn-primary">Add</button>
 </div>
</form>
<!-- end form -->

</div>
</body>
</html>