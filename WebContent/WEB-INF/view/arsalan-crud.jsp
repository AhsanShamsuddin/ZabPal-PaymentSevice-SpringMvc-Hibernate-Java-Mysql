<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Arsalan CRUD</title>
</head>
<body>
		<h1>Add</h1>  
       <form:form method="post" modelAttribute="ah" action="savearsalan">    
        <table >    
         <tr>    
          <td>FirstName : </td>   
          <td><form:input path="fname"/></td>  
         </tr>    
         <tr>    
          <td>LastName : </td>   
          <td><form:input path="lname"/></td>  
         </tr>
         <tr>    
          <td>Age :</td>    
          <td><form:input path="age" /></td>  
         </tr>   
         <tr>    
          <td>Reg ID :</td>    
          <td><form:input path="regid" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>  
       
       <h1>List</h1>  
	<table border="2" width="70%" cellpadding="2">
		<tr>
		<th>ID</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Age</th>
		<th>Reg ID</th>
		</tr>
		<c:forEach var ="ar" items="${listarsalan}">     
		<tr>  
		   <td>${ar.arid}</td>  
		   <td>${ar.fname}</td>  
		   <td>${ar.lname}</td> 
		   <td>${ar.age}</td>  
		   <td>${ar.regid}</td>    
		   <td><a href="deleteArsalan/${ar.arid}">Delete</a></td>  
		</tr>  
		</c:forEach>
   </table>   
</body>
</html>