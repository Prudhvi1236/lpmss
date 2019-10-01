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

import com.lpms.model.LP;
import com.lpms.service.LPService;
import com.lpms.service.LPServiceImp;

/**
 * Servlet implementation class ViewProfile
 */
@WebServlet("/ViewProfile")
public class ViewProfile extends HttpServlet 
{
	private static final Logger log = Logger.getRootLogger();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession(false);
		String emp_id=(String) session.getAttribute("eId");
		
		LPService impl= new LPServiceImp();
		LP obj=impl.findById(emp_id);
	    
		request.setAttribute("employee", obj);
		
		log.trace("LP from db:"+obj);
		//assert(obj!=null);
		/*request.setAttribute("eId", emp_id);
		request.setAttribute("name", obj.getName());
		request.setAttribute("email", obj.getEmail());
		request.setAttribute("password", obj.getPassword());
		request.setAttribute("phno",obj.getPhno());
	*/

		request.getRequestDispatcher("/ViewProfile.jsp").forward(request, response);
		
		
		
		

	}

}
