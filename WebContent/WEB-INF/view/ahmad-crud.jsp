<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ahmad CRUD</title>
</head>
<body>
		<h1>Add</h1>  
       <form:form method="post" modelAttribute="ahm" action="saveahmad">    
        <table >    
         <tr>    
          <td>FirstName : </td>   
          <td><form:input path="fname"/></td>  
         </tr>    
         <tr>    
          <td>DOB : </td>   
          <td><form:input path="dob"/></td>  
         </tr>
         <tr>    
          <td>GPA :</td>    
          <td><form:input path="gpa" /></td>  
         </tr>   
         <tr>    
          <td></td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>  
       
       <h1>List</h1>  
	<table border="2" width="70%" cellpadding="2">
		<tr>
		<th>ID</th>
		<th>FirstName</th>
		<th>Date of Birth</th>
		<th>GPA</th>
		</tr>
		<c:forEach var ="ahm" items="${listAhmad}">     
		<tr>  
		   <td>${ahm.ahid}</td>  
		   <td>${ahm.fname}</td>  
		   <td>${ahm.dob}</td> 
		   <td>${ahm.gpa}</td>  
		   <td><a href="deleteAhmad/${ahm.ahid}">Delete</a></td>  
		</tr>  
		</c:forEach>
   </table>   
</body>
</html>