package com.ServletConfigServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

    public MyServlet() {
        super();
    }
    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();

		
		//-ServletContext-An object created by Servlet Container to share
		//-initial parameters or configuration information which is accessible to
		//-all servlet.
		ServletContext ctx=getServletContext();//we are getting this method from HttpServlet
		//-and HttpServlet extends GenericServlet
		String str1=ctx.getInitParameter("servCont");//gives the value of this 'name'(name is in web.xml)
		out.println(str1);
		
		
		//-ServletConfig-to share initial parameter and configuration for specific servlet.
		ServletConfig cg=getServletConfig();
		String str2=cg.getInitParameter("servConfig");
		out.println(str2);
	}


}
