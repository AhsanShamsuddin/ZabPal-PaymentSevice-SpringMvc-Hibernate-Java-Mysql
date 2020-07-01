<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

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
	    <h1 class="display-4">Welcome To ZABPAL E-TRANSACTION</h1>
	    <p class="lead">Created By Us</p>
	  </div>
	</div>
	
	<form:form id="frm1" name="regForm" modelAttribute="ETR" action = "makepayment" method="get" >
	  <div class="form-group">
	    <label for="egFN">Sender Email</label>
	    <form:input path="sendername" class="form-control" id="egFN" placeholder="Sender Email" type="email" value="${Email}" readonly="readonly"></form:input>
	  	<p id="demo"></p>
	  </div>
	  
	  <label>Receiver Email : </label>
	 <form:select path="rid">
	      <c:forEach var="user" items="${emails}">
		  	<form:option value="${user.id}">${user.email}</form:option>
		  </c:forEach>
	  </form:select>
	
	  <div class="form-group">
	    <label for="egUN">Credit Card</label>
	    <form:input path="creditcard" class="form-control" id="egUN" placeholder="Credit Card" value="${card}" readonly="readonly"></form:input>
	    <p id="demo2"></p>
	  </div>
	  
	  <div class="form-group">
	    <label for="egUN">Amount</label>
	    <form:input path="amount" class="form-control" id="egUN" placeholder="Amount" required="true"></form:input>
	    <p id="demo2"></p>
	  </div>
	 
	  <div class="form-group">
	    <form:input path="sid" type="hidden" class="form-control" id="egUN" placeholder="Sender ID" value="${ID}"></form:input>
	    <p id="demo2"></p>
	  </div>
	
	  <br>
	  <input class="btn btn-lg btn-primary" type="submit" id="btn" value="Make Payment">
	</form:form>

</body>
</html>
