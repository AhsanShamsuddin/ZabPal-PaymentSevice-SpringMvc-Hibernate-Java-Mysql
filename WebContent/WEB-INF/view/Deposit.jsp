<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Setup Bank Account Page</title>

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
	    <h1 class="display-4">Welcome To ZABPAL Online Bank</h1>
	    <p class="lead">Created By Us</p>
	  </div>
	</div>
	
	<form:form id="frm1" name="regForm" modelAttribute="dp" action = "addAmount" method="get" >
	  <div class="form-group">
	    <label for="egFN">Deposit Amount</label>
	    <form:input path="Total_balance" class="form-control" id="egFN" placeholder="Enter Amount"></form:input>
	  	<p id="demo"></p>
	  </div>
	  
	  <input class="btn btn-lg btn-primary" type="submit" id="btn" value="Deposit Amount">
	</form:form>

</body>
</html>
