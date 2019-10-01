package com.lpms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.Batch;
import com.lpms.model.Mentor;
import com.lpms.model.Module;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;
import com.lpms.service.MentorService;
import com.lpms.service.MentorServiceImp;

/**
 * Servlet implementation class AddModule
 */
@WebServlet("/AddModule")
public class AddModule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddModule() {
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
	
		int moid = Integer.parseInt(request.getParameter("moid"));
		String modulename =request.getParameter("modulename");
		String date =request.getParameter("date");
		String batchid =request.getParameter("batchid");
		
		Module registerBean = new Module();
	
		registerBean.setMoId(moid);
		registerBean.setModuleName(modulename);
		registerBean.setDate(date);
		registerBean.setBatchId(batchid); 
		
		MentorService registerDao = new MentorServiceImp();
	
		String userRegistered = registerDao.createModule(registerBean);
		if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		{
		request.getRequestDispatcher("/AddModule.jsp").forward(request, response);
		}
		else   //On Failure, display a meaningful message to the User.
		{
		request.setAttribute("errMessage", userRegistered);
		request.getRequestDispatcher("/AddModule.jsp").forward(request, response);
		}
		
	}

}
