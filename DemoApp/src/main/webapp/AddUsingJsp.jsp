<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- In JSP we do not need Http Request or Response objects because we get ''request and
'response' automatically-->
	<% //this delimiter is called Scriplet-within it java code can be written inside html
	
	int i=Integer.parseInt(request.getParameter("num1"));
	int j=Integer.parseInt(request.getParameter("num2"));
	int k=i+j;
	out.println("Sum is "+k);// we get 'out' automatically by web container.
	%>
</body>
</html>