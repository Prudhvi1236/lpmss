package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.Module;
import com.lpms.service.MentorService;
import com.lpms.service.MentorServiceImp;

/**
 * Servlet implementation class ViewMentorModule
 */
@WebServlet("/ViewMentorModule")
public class ViewMentorModule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMentorModule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String batchId = request.getParameter("batchId");
		PrintWriter out = response.getWriter();
		

		
		MentorService impl = new MentorServiceImp();
		List<Module> module=impl.viewMentorModule(batchId);
		
		if(!module.isEmpty()) {
			out.println("<h1>Module</h1>");
		out.println("<table border='1' width='80%'>");
		out.println("<tr><th>ModuleId</th><th>ModuleName</th><th>Date</th></tr>");
		for(Module b1:module)
		{
			String date1=b1.getDate();
			String date=date1.substring(0,10);
			out.println("<tr><td>"+b1.getMoId()+"</td><td>"+b1.getModuleName()+"</td><td>"+date+"</td></tr>");
		}
		out.println("</table>");
		out.print("<br>");
		out.println("<a href='" + getServletContext().getContextPath() + "/MentorHome.jsp'>Home</a>"); 
		out.close();

	}
		else {
			out.println("<h1>No Module was created</h1>");
			out.println("<a href='" + getServletContext().getContextPath() + "/MentorHome.jsp'>Home</a>"); 
		}
	}

}
