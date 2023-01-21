package com.mathOps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//as soon as we extend the class to HttpServlet the class become Servlet
public class AdditionServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	//-Other method name cannot work, since service() method
	//-HttpServletRequest and HttpServletResponse are Interfaces which are implemented
	//-by TomCat server and req and res object are provided by it

	//belongs to servlet life cycle
	{
		int i=Integer.parseInt(req.getParameter("num1"));//1st input from html page, value is returned in String
		int j=Integer.parseInt(req.getParameter("num2"));//2nd input from html page
		int k=i+j;
		
		//1.
		//req.setAttribute("k", k);//this method is used in conjunction with RequestDispatcher
		//-putting k in req object
		
		//RequestDispatcher rd=req.getRequestDispatcher("square");
		//-this method is sending two object res and req and same object are being used 
		//-in SquareServlet servlet
		
		//rd.forward(req, res);
		//PrintWriter out=res.getWriter();
		//-When we want to sent data from one servlet to other basically Data Sharing
		//-we use the concept of Session Management.
		
		
		//2.SESSION
		//HttpSession session=req.getSession();//to get the hold to session object provided by TomCat
		//-HttpSession is Interface
		//session.setAttribute("k",k);//setting the session object to k and loading value k
		
		
		//3.COOKIES
		//-here the response object will first go from this servlet to clinet and then from
		//-there response object will go to other servlet
		Cookie cookie=new Cookie("k", k+"");//here we have to instantiate because cookie is a class.
		res.addCookie(cookie);//sending response(cookie) to the client.
		
		
		
		
		
		res.sendRedirect("square");//current servlet is sending response to client to go to
		//square servlet
	}
}
