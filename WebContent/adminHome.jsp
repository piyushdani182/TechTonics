<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tech Tonics</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="index.jsp">ATMECS Tech Tonics</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li><a href="index.jsp">Home</a></li>
	      <li class="active"><a href="#">Tech Talks</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${user.getEmployeeName()} </a></li>
	      <li><a href="SignOut"><span class="glyphicon glyphicon-log-out"></span> Sign Out</a></li>
	    </ul>
	  </div>
	</nav>
	<div class="jumbotron">
	  <!-- <h1 class="display-3">Upcoming Tech Talks!!!</h1> -->
	  <center><h3>Upcoming Tech Talks!!!</h3></center>
	   <div class="container">
		   <table class="table table-striped">
			    <thead>
			      <tr>
			        <th class="success">Tech Talk Name</th>
			        <th class="success">Description</th>
			        <th class="success">Date</th>
			        <th class="success">Presenter</th>
			        <th class="success"></th>
			        <th class="success"></th>
			      </tr>
			    </thead>
			    <tbody>
			    <c:forEach items="${ttList}" var="e">	
			      <tr>
			        <td>${e.name}</td>
			        <td>${e.description}</td>
			        <td>${e.date}</td>
			        <td>${e.presenter}</td>
			      	<td>
			        	<%-- <a href="FetchTT?id=${e.id}"><img src="img/edit.png"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			        	<a href="DeleteTT?id=${e.id}"><img src="img/delete.png"></a> --%>
			        	<a href="FetchTT?id=${e.id}"><button>Update</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			        	<a href="DeleteTT?id=${e.id}"><button>Delete</button></a>
			        </td>
			     </tr>
			    </c:forEach>
			   </tbody>
		  </table>
		</div>
	<center>
		<a href="addTT.jsp"><button>Add Tech Talk</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href=""><button>View Requests of TT</button></a>
	</center>
	</div>
</body>
</html>