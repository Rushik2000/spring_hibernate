<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome Page</h2>
	
	<table border="1px">
		<tr>
			<th>Id</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		
	<c:forEach var="s" items="${list}">	
		<tr>
			<td>${s.id}</td>
			<td>${s.fname}</td>
			<td>${s.lname}</td>
			<td>${s.email}</td>
			<td>${s.password}</td>
			<td>
				<a href="editstud/${s.id}">Edit</a>
				<a href="deletestud/${s.id}">Delete</a>
			</td>
		</tr>
	</c:forEach>
	
		
	</table>

</body>
</html>