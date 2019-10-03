package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.Batch;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;

/**
 * Servlet implementation class GetBatchRecords
 */
@WebServlet("/GetBatchRecords")
public class GetBatchRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetBatchRecords() {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Batch Records</h1>");
		AdminService as = new AdminServiceImp();
		List<Batch> list= as.getBatchRecords();
		
		out.println("<table border='1' width='80%'>");
		out.println("<tr><th>BatchId</th><th>BatchCourse</th><th>capacity</th><th>MentorId</th></tr>");
		for(Batch b1:list)
		{
			out.println("<tr><td>"+b1.getBatchId()+"</td><td>"+b1.getBatchCourse()+"</td><td>"+b1.geteId()+"</td><td>"+b1.getBatchCapacity()+"</td></tr>");
		}
		out.println("</table>");
		out.println("<a href='" + getServletContext().getContextPath() + "/AdminHome.jsp'>Home</a>");
		out.close();
	}

}
