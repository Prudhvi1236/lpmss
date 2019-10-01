package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lpms.model.LP;
import com.lpms.service.LPService;
import com.lpms.service.LPServiceImp;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
	    response.setContentType("text/html");
	    
		HttpSession session = request.getSession(false);
		String eId= request.getParameter("eId");
	    
		String name=request.getParameter("name");
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		long phonenumber=Long.parseLong((request.getParameter("phno")));
		
		LP emp= new LP(eId,name,email,password,phonenumber);
		
		LPService impl = new LPServiceImp();
		
		LP updated = impl.updateProfile(emp);
		pw.print("servlet");
		if(updated!=null)
		{
			pw.print("Details Updated");
			pw.print("<a href=\"LPHome.jsp\">Click Here to Go to Home Page</a>");
		}
		else
		{
			pw.print("Details Not Updated");
			pw.print("<a href=\"ViewProfile.jsp\">Click Here Update again</a>");

		}
		pw.close();
		


	}

}
