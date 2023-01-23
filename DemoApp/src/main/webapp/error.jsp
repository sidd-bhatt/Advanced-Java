<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
    <%--isErrorPage is used to find out is it reallly an error page --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
Error
<%=exception.getMessage()//getMessage() will fetch the kind of error occured and will show it %>
</body>
</html>