package com.lpms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpms.model.LP;
import com.lpms.model.Mentor;
import com.lpms.service.AdminService;
import com.lpms.service.AdminServiceImp;
import com.lpms.service.MentorService;
import com.lpms.service.MentorServiceImp;

/**
 * Servlet implementation class AddLP
 */
@WebServlet("/AddLP")
public class AddLP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLP() {
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
		
		String eid = request.getParameter("eid");
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		long phno = Long.parseLong(request.getParameter("phno"));
		String batchid=request.getParameter("batchid");
		
		LP registerBean = new LP();
	
		registerBean.seteId(eid);
		registerBean.setName(name);
		registerBean.setEmail(email);
		registerBean.setPassword(password); 
		registerBean.setPhno(phno);
		registerBean.setBatchId(batchid);
		MentorService registerDao = new MentorServiceImp();
	
		String userRegistered = registerDao.addLP(registerBean);
		if(userRegistered.equals("successfully done..."))   //On success, you can display a message to user on Home page
		{
			request.setAttribute("Message", userRegistered);
		request.getRequestDispatcher("/AddLP.jsp").forward(request, response);
		}
		else   //On Failure, display a meaningful message to the User.
		{
		request.setAttribute("Message", userRegistered);
		request.getRequestDispatcher("/AddLP.jsp").forward(request, response);
		}
	}
	
	

}
