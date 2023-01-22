package com.mathOps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/square")
public class SquareServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException//Other method name cannot work, since service() method
	{
		int k=0;
		//-to call other servlet
		//-1.Request Dispatcher
		//-2.Redirect
		
		//1.
		//k=(int) req.getAttribute("k");
		
		
		//2.SESSION
		//HttpSession session=req.getSession();//getting hold of session object
		//k=(int)session.getAttribute("k");//getting the object i.e. k stored in session object
		//-and type casting it.
		
		
		//3.COOKIE
		Cookie cookies[]=req.getCookies();//getting the cookie from request object of client
		//we will have to use array of Cookie because client is sending many cookies
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))//check from all the cookies which is named k
			{
				k=Integer.parseInt(c.getValue());//get its value
			}
		}
		
		
		
		PrintWriter out=res.getWriter();
		out.println("Result is: "+k*k);
		
	}
	

}
