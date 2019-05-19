<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC PROJECT</title>
</head>
<body>
<form:form method="post"
          action="/mvc_Project/save" modelAttribute="classification">
          <title><h3>MVC NEW PROJECT </h3></title>
             <table border=1>
                <tr>
                    <td><form:label path="classificationId">Classification Id</form:label></td>
                    <td><form:input path="classificationId"/></td>
                </tr>
                <tr>
                    <td><form:label path="classificationName">Classification Name</form:label></td>
                    <td><form:input path="classificationName"/></td>
                </tr>
               
                <tr>
                    <td><input type="submit" value="save"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
