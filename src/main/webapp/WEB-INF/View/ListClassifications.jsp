<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List</h1>


<table>
	<tr>
		<th>Classification Id</th>
		<th>Classification Name</th>
	</tr>
	
	
	<c:forEach var="classification" items="${list}">
	<tr>
		<td><c:out value="${classification.classificationId}"/></td>
		<td><c:out value="${classification.classificationName}"/></td>
	</tr>
		</c:forEach>
	
</table>
 
</body>
</html>