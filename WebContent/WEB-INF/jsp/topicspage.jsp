<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Topics</h2>
<%
for(String t: (String[])request.getAttribute("topics"))
{
%>
<h3><%=t %></h3>
<%
}
%>
</body>
</html>