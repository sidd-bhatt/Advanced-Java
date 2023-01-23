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
	
<!-- Servlets cannot run JSP -->
<!--We cannot run JSP file directly, but we can run Servlet using Tomcat(that's why tomcat is also called
Servlet container) -->
<!-- So basically when we run, say, add.jsp file, it gets converted into add_jsp.java file by 
Web Container implicitly and all the java code within .jsp file will be kind of copy pasted into
a servlet inside the add_jsp.java file(that is the reason we automatically get the objects in .jsp files.)-->

<%--JSP DIrective:
 1.@page: 
 	<%@page attribute="value" attribute="value"... %>
 2.@include
 3.@taglib --%>


</body>
</html>