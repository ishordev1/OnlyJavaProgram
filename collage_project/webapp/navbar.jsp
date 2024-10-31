<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>

</style>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid ms-5 me-5">
    <a class="navbar-brand bg-warning p-2" href="#"><b>Diploma Project</b></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
     <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="image.jsp">Image</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="calculator.jsp">Calculator</a>
        </li>
      
         <li class="nav-item">
          <a class="nav-link" href="u_Quiz_list.jsp">Quiz APPlication</a>
        </li>
        
      </ul>
      
      <form class="d-flex" role="search">
     
        <button class="btn btn-outline-danger" ><a href="signin.jsp" class="text-white">sign in</a></button>
       
      </form>
      
    </div>
  </div>
</nav>

</body>
</html>