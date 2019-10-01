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
 * Servlet implementation class AddBatch
 */
@WebServlet("/AddBatch")
public class AddBatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBatch() {
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
		
		String batchid =request.getParameter("batchid");
		String batchcourse =request.getParameter("batchcourse");
		String eid = request.getParameter("eid");
		int batchcapacity=Integer.parseInt(request.getParameter("batchcapacity"));
		
		Batch registerBean = new Batch();
	
		registerBean.setBatchId(batchid);
		registerBean.setBatchCourse(batchcourse);
		registerBean.seteId(eid);
		registerBean.setBatchCapacity(batchcapacity);

		MentorService registerDao = new MentorServiceImp();
	    
		String userRegistered= registerDao.addBatch(registerBean);
		System.out.print(userRegistered);
		String userRegistered1 = registerDao.batchRecords(registerBean);
		System.out.print(userRegistered);
		request.setAttribute("msg",userRegistered);
		request.getRequestDispatcher("/BatchMessage.jsp").forward(request, response);
		/*if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		{
		request.getRequestDispatcher("/Batch.jsp").forward(request, response);
		}
	    //On Failure, display a meaningful message to the User.
		{
		request.setAttribute("errMessage", userRegistered);
		request.getRequestDispatcher("/Batch.jsp").forward(request, response);
		}*/
	}	
	

}
