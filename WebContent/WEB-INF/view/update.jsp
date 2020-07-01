<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Bank Account Page</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" ">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<style type="text/css">

	#frm1 {
		margin: 100px;
	}
	
	#demo, #demo1, #demo2, #demo3{
		color : red;
	}

</style>

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <a class="navbar-brand" href="#">Web Tech project</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	    <div class="navbar-nav">
	    </div>
	  </div>
	</nav>
	
	<div class="jumbotron jumbotron-fluid">
	  <div class="container">
	    <h1 class="display-4">Update Profile Info</h1>
	    <p class="lead">Created By Us</p>
	  </div>
	</div>
	
	<form:form id="frm1" name="regForm" modelAttribute="UA" action = "updateAccount" method="get" >
	  <div class="form-group">
	    <label for="egFN">First Name</label>
	    <form:input path="firstname" class="form-control" id="egFN" placeholder="First Name" value="${User}"></form:input>
	  	<p id="demo"></p>
	  </div>

	  <div class="form-group">
	    <label for="egLN">Last Name</label>
	    <form:input path="lastname" class="form-control" id="egLN" placeholder="Last Name" value="${lName}"></form:input>
	  	<p id="demo1"></p>
	  </div>
	
	
	  <div class="form-group">
	    <label for="egUN">Email</label>
	    <form:input path="email" class="form-control" id="egUN" placeholder="Email" value="${Email}"></form:input>
	    <p id="demo2"></p>
	  </div>
	
	  <div class="form-group">
	    <label for="egUN">Password</label>
	    <form:input path="password" class="form-control" id="egUN" placeholder="Password" value="${pass}"></form:input>
	    <p id="demo2"></p>
	  </div>
	  
	  <div class="form-group">
	    <label for="egUN">Address</label>
	    <form:input path="address" class="form-control" id="egUN" placeholder="Address" value="${addr}"></form:input>
	    <p id="demo2"></p>
	  </div>
	  
	  <div class="form-group">
	    <label for="egUN">Phone Number</label>
	    <form:input path="phNumber" class="form-control" id="egUN" placeholder="Phone Number" value="${phnum}"></form:input>
	    <p id="demo2"></p>
	  </div>
	  
	  <div class="form-group">
	    <label for="egUN">Credit Card Number</label>
	    <form:input path="cardnum" class="form-control" id="egUN" placeholder="Credit Card Number" value="${card}"></form:input>
	    <p id="demo2"></p>
	  </div>
	  
	  <input class="btn btn-lg btn-success" type="submit" id="btn" value="Update Information"">
	</form:form>

</body>
</html>
