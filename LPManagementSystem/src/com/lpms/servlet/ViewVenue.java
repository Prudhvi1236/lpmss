package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.Batch;
import com.lpms.model.Venue;
import com.lpms.service.LPService;
import com.lpms.service.LPServiceImp;

/**
 * Servlet implementation class ViewVenue
 */
@WebServlet("/ViewVenue")
public class ViewVenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewVenue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String batchId = request.getParameter("batchId");
		//System.out.println(batchId);
		PrintWriter out = response.getWriter();
		out.println("<h1>Venue and course details</h1>");

		
		LPService impl = new LPServiceImp();
		Batch batch=impl.findByBatchId(batchId);
		
		
		out.println("<table border='1' width='80%'>");
		out.println("<tr><th>Batch Course</th><th>Venue Address</th></tr>");
	
			
			out.println("<tr><td>"+batch.getBatchCourse()+"</td><td>"+batch.getVenue().getVenueAddress()+"</td></tr>");
			//System.out.println(batch.getVenue().getVenueAddress());
		
		out.println("</table>");
		out.print("<br>");
		out.println("<a href='" + getServletContext().getContextPath() + "/LPHome.jsp'>Home</a>"); 
		out.close();

		
	}

}
