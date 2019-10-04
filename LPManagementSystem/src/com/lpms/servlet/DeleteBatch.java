package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lpms.model.Batch;
import com.lpms.service.MentorService;
import com.lpms.service.MentorServiceImp;

/**
 * Servlet implementation class DeleteBatch
 */
@WebServlet("/DeleteBatch")
public class DeleteBatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBatch() {
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
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String batchid=request.getParameter("batchid");
		String eid=(String) session.getAttribute("eId");

          Batch batchbean=new Batch();
          batchbean.setBatchId(batchid);
          batchbean.seteId(eid);
          MentorService mentorservice = new MentorServiceImp();
    	if( mentorservice.deleteBatch(batchbean)) {
    		response.getWriter().println("<a href='MentorHome.jsp'> Go back to Home</a>");
    		out.println("<h2>Successfully deleted</h2>");   			
    	}else {
    		
    		response.getWriter().println(" <a href='DeleteBatch.jsp'> Try again</a>");	
    		
    	}
        
 		

		
	}

}
