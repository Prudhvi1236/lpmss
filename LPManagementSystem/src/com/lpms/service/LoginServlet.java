package com.lpms.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.lpms.model.Venue;


public class LoginServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String eid = request.getParameter("eId");
		String password = request.getParameter("password");
		
	       
		
		
		LoginService ls = new LoginService();
		
		boolean status = ls.validateAdminLogin(eid,password);
		if(status)
		{
			HttpSession session= request.getSession();
			session.setAttribute("eId",eid);
			
			AdminService adminservice= new AdminServiceImp();
			List<Venue> list=adminservice.viewVenue();
			request.setAttribute("list", list);
			log.trace("venue from db:"+list);
			
			request.getRequestDispatcher("/AdminHome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("errMessage", "invalid user id or password");
			
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
		pw.close();
		
		
			}
	
	

}
