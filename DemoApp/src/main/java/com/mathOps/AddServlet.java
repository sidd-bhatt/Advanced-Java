package com.mathOps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//as soon as we extend the class to HttpServlet the class become Servlet
public class AddServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	//Other method name cannot work, since service() method

	//belongs to servlet life cycle
	{
		int i=Integer.parseInt(req.getParameter("num1"));//1st input from html page, value is returned in String
		int j=Integer.parseInt(req.getParameter("num2"));//2nd input from html page
		int k=i+j;
		
		req.setAttribute("k", k);//this method is used in conjunction with RequestDispatcher
		//putting k in req object
		
		
		RequestDispatcher rd=req.getRequestDispatcher("square");
		//this method is sending two object res and req and same object are being used 
		//in SquareServlet servlet
		
		rd.forward(req, res);
		//PrintWriter out=res.getWriter();
		//When we want to sent data from one servlet to other basically Data Sharing
		//we use the concept of Session Management.
	}
}
