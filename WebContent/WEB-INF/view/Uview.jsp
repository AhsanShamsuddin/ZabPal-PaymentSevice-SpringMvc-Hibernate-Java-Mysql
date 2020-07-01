<%@page import="com.model.user"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<center><h1>Welcome Id = ${ID} and ${User} your Emails = ${Email}</h1></center>
<center><h1>Total Balance = $${Total}</h1></center>

<br>
<br>
<a href="setupTransaction" class="btn btn-primary btn-lg btn-block">Transaction</a>
<br>
<a href="deposit" class="btn btn-success btn-lg btn-block">Deposit Amount</a>
<br>
<a href="withdraw" class="btn btn-danger btn-lg btn-block">Withdraw Amount</a>
<br>
<a href="udAccount" class="btn btn-secondary btn-lg btn-block">Update Account Info</a>
<br>
<a href="ahsan" class="btn btn-primary btn-lg btn-block">Ahsan CRUD</a>
<br>
<a href="arsalan" class="btn btn-success btn-lg btn-block">Arsalan CRUD</a>
<br>
<a href="ahmad" class="btn btn-danger btn-lg btn-block">Ahmad CRUD</a>
<br>
<a href="asad" class="btn btn-secondary btn-lg btn-block">Asad CRUD</a>
<br>
<br>
<a href="logout" class="btn btn-primary btn-lg btn-block">Logout</a>

</body>
</html>