package com.lpms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lpms.model.Batch;
import com.lpms.model.LP;
import com.lpms.model.Module;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;
import com.lpms.service.LPService;
import com.lpms.service.LPServiceImp;

/**
 * Servlet implementation class ViewModule
 */
@WebServlet("/ViewModule")
public class ViewModule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewModule() {
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
		response.setContentType("text/html");
		
		//HttpSession session = request.getSession(false);
		//int eid=(int)session.getAttribute("eId");
		String batchId = request.getParameter("batchId");
		//System.out.println(batchId);
		PrintWriter out = response.getWriter();
		out.println("<h1>Module</h1>");

		
		LPService impl = new LPServiceImp();
		List<Module> module=impl.viewModule(batchId);
		
		
		out.println("<table border='1' width='80%'>");
		out.println("<tr><th>ModuleId</th><th>ModuleName</th><th>Date</th></tr>");
		for(Module b1:module)
		{
			String date1=b1.getDate();
			String date=date1.substring(0,10);
			out.println("<tr><td>"+b1.getMoId()+"</td><td>"+b1.getModuleName()+"</td><td>"+date+"</td></tr>");
		}
		out.println("</table>");
		out.close();

	}

}
