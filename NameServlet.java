package com.telusko.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/name")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		int sno=Integer.parseInt(req.getParameter("serial"));
		System.out.println(sno);
		Serial_Names sn=new Serial_Names();
		
		String uname=sn.retrieve(sno);
		
		//req.setAttribute("key", uname);
		
		//RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		
		//rd.forward(req,res);
	
	   HttpSession session=req.getSession();
		
	   session.setAttribute("display", uname);
	   
	   res.sendRedirect("display.jsp");
	}

}
