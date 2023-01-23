<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//Establishing connection
		String url="jdbc:mysql://localhost:3306/sidd";
		String username="root";
		String password="root@123";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		//Writing MYSQL query 
		String query="select * from students where sid=1;";
		//Using Statement to run the query
		Statement st=con.createStatement();
		//Storing the retrieved data into ResultSet object 'rs'
		ResultSet rs=st.executeQuery(query);
		rs.next();
	%>
	Student id:<%=rs.getString(1)%><br>
	Student Name:<%=rs.getString(2) %> <br>
	Student Course:<%=rs.getString(3) %> <br>
	
	<% 
		String insert="insert into students values(4,'avez','DITIS')";
		st.execute(insert);
		out.println("Successfully inserted data");
	%>

</body>
</html>