package com.lpms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.lpms.model.Venue;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;

/**
 * Servlet implementation class GetVenueRecords
 */
@WebServlet("/GetVenueRecords")
public class GetVenueRecords extends HttpServlet {
	private static final Logger log = Logger.getRootLogger();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetVenueRecords() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
		
		//HttpSession session = request.getSession(false);
		//String emp_id=(String) session.getAttribute("eId");
		
		AdminService adminservice= new AdminServiceImp();
		List<Venue> obj=adminservice.viewVenue();
		request.setAttribute("venue", obj);
		log.trace("venue from db:"+obj);
		
		request.getRequestDispatcher("/AdminHome.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
