package com.mathOps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException//Other method name cannot work, since service() method
	{
		//to call other servlet
		//1.Request Dispatcher
		//2.Redirect
		int k=(int) req.getAttribute("k");
		PrintWriter out=res.getWriter();
		out.println("Result is: "+(k*k));
		
	}
	

}
