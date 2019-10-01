package com.lpms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.Batch;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;

/**
 * Servlet implementation class AllocateVenue
 */
@WebServlet("/AllocateVenue")
public class AllocateVenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllocateVenue() {
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
		
		String batchid=request.getParameter("batchid");
		int venueid=Integer.parseInt(request.getParameter("venueid"));

          Batch batchbean=new Batch();
          batchbean.setBatchId(batchid);
          batchbean.setVenueId(venueid);
          AdminService adminser = new AdminServiceImp();
    	 adminser.allocateVenue(batchbean);
        
 		request.getRequestDispatcher("/AllocateVenue.jsp").forward(request, response);
 		
 	

		
	}

}
