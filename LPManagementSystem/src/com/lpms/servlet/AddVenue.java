package com.lpms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.Mentor;
import com.lpms.model.Venue;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;

/**
 * Servlet implementation class AddVenue
 */
@WebServlet("/AddVenue")
public class AddVenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVenue() {
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
		
		
		int venueid =Integer.parseInt(request.getParameter("venueid"));
		String venueaddress =request.getParameter("venueaddress");
		int capacity = Integer.parseInt(request.getParameter("capacity"));
		
		Venue registerBean = new Venue();
	
		registerBean.setVenueId(venueid);
		registerBean.setVenueAddress(venueaddress);
		registerBean.setCapacity(capacity);
		
		AdminService registerDao = new AdminServiceImp();
	
		String userRegistered = registerDao.addVenue(registerBean);
		if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		{
		request.getRequestDispatcher("/AddVenue.jsp").forward(request, response);
		}
		else   //On Failure, display a meaningful message to the User.
		{
		request.setAttribute("errMessage", userRegistered);
		request.getRequestDispatcher("/AddVenue.jsp").forward(request, response);
		}
		
		
		
	}

}
