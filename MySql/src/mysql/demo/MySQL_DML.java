package mysql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.RuntimeErrorException;

public class MySQL_DML {
	//For: Insert, Update and Delete:
	//Create Connection
	//Create statement/Query
	//Execute statement/Query
	//Close connection
	
	public static void main(String[] args) throws ClassNotFoundException  
	{
		//to establish connection
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysq://localhost:3306/sidd","root","root@123");
			//create a statement or query
			Statement stmt=con.createStatement();
			//by using the Statement object we can execute our query
			String query="insert into students values(3,'leema','literature')";
			stmt.execute(query);
			con.close();
			System.out.println("Query executed");
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
