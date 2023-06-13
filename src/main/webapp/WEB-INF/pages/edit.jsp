<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Edit Student</h2>
	
	<form:form action="/spring_hibernate/update" method="post">
		
		<form:hidden path="id"></form:hidden>
		<form:input path="fname"></form:input><br><br>
		<form:input path="lname"></form:input><br><br>
		<form:input path="email"></form:input><br><br>
		<form:input path="password"></form:input><br><br>
		
		<button type="submit">Submit</button>
	
	</form:form>

</body>
</html>