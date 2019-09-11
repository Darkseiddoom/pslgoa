<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<td><a href="index.jsp">Home</a></td>
<!--<h1>${msg}</h1>-->
<h1>${msg}</h1>
<h1><%= request.getAttribute("name") %></h1>
</body>
</html>