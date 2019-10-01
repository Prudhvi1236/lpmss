package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.lpms.model.Mentor;
import com.lpms.service.MentorService;
import com.lpms.service.MentorServiceImp;

/**
 * Servlet implementation class ViewMentorProfile
 */
@WebServlet("/ViewMentorProfile")
public class ViewMentorProfile extends HttpServlet {
	private static final Logger log = Logger.getRootLogger();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMentorProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(false);
		String emp_id=(String) session.getAttribute("eId");
		
		MentorService impl= new MentorServiceImp();
		Mentor obj=impl.findById(emp_id);
		request.setAttribute("employee", obj);
		log.trace("mentor from db:"+obj);
		

		request.getRequestDispatcher("/MentorViewProfile.jsp").forward(request, response);
		
		
		
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
