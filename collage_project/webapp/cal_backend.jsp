<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="div_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
*{
margin:0;
padding:0;
}
.con{
width:90%;
margin:auto;
}
</style>
<body>
<%@include file="calculator.jsp" %>
<div class="con">
<div class="row justify-content-md-center mt-4 p-3 border-0 shadow">
<h3 class="text-center">Result</h3>
<h4 class="text-center">
<%

	String n1=request.getParameter("n1");
	String n2=request.getParameter("n2");
	String op=request.getParameter("op");

	
	if(n1==""){
		out.println("Enter number in First Fields");
	}
	else if(request.getParameter("op")==null){
		out.println("select any operator");
	}
	else if(n2==""){
		out.println("Enter number in second Fields");
	}
	else{
		float f=Float.parseFloat(n1);
		float f2=Float.parseFloat(n2);
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
	switch(op){
	case "add":
	{
		out.println(nn1+"+"+nn2+"="+(nn1+nn2));
		break;
	}
	case "sub":
	{
		out.println(nn1+"-"+nn2+"="+(nn1-nn2));
		break;
	}
	
	case "mul": 
	{
		out.println(nn1+"X"+nn2+"="+(nn1*nn2));
		break;
	}
	case "div":
	{
		out.println(nn1+"/"+nn2+"="+(f/f2));
		break;
	}
	
	
	}
	}

%>
</h4>
</div>
</div>
</body>
</html>