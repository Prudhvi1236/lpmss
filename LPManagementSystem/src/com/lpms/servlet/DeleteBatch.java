package com.lpms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		String batchid=request.getParameter("batchid");
		String eid=request.getParameter("eId");

          Batch batchbean=new Batch();
          batchbean.setBatchId(batchid);
          batchbean.seteId(eid);
          MentorService mentorservice = new MentorServiceImp();
    	if( mentorservice.deleteBatch(batchbean)) {
    		response.getWriter().println("Deleted succesfully<a href='MentorHome.jsp'> Go back to Home</a>");
//    		request.getRequestDispatcher("/DeleteBatch.jsp").forward(request, response);	
    	}else {
    		response.getWriter().println("Deleted Failed <a href='DeleteBatch.jsp'> Try again</a>");	
    	}
        
 		

		
	}

}
