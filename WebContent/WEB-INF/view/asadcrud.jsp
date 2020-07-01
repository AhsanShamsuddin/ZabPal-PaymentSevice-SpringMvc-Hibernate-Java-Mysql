<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asad Crud</title>
</head>
<body>

        <h1>Add</h1>  
       <form:form method="post" modelAttribute="a" action="saveasad">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"/></td>  
         </tr>    
         <tr>    
          <td>RegID :</td>    
          <td><form:input path="regid" /></td>  
         </tr>   
         <tr>    
          <td>Courses :</td>    
          <td><form:input path="courses" /></td>  
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
		<th>Name</th>
		<th>Reg ID</th>
		<th>Courses</th>
		</tr>
		<c:forEach var="asa" items="${listasad}">     
		<tr>  
		   <td>${asa.id}</td>  
		   <td>${asa.name}</td>  
		   <td>${asa.regid}</td>  
		   <td>${asa.courses}</td>    
		   <td><a href="deleteAsad/${asa.id}">Delete</a></td>  
		</tr>  
		</c:forEach>
   </table>   

</body>
</html>