package com.lpms.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lpms.model.Mentor;
public class MLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MLoginServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		String eid = request.getParameter("eId");
		String password = request.getParameter("password");

		Mentor loginBean = new Mentor(); 
		loginBean.seteId(eid); 
		loginBean.setPassword(password);
		MentorService ms = new MentorServiceImp();	
		String userValidate = ms.validateMentorLogin(loginBean); 

		if(userValidate.equals("SUCCESS"))
		{
			HttpSession session= request.getSession();
			session.setAttribute("eId",eid);
			
			request.getRequestDispatcher("/MentorHome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("errMessage", userValidate);
			request.getRequestDispatcher("/MentorLog.jsp").forward(request, response);
			}

}
}