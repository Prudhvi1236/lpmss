package com.lpms.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lpms.dao.LPDaoImp;
import com.lpms.model.LP;
import com.lpms.service.LPService;
import com.lpms.service.LPServiceImp;


public class LPLogServlet extends HttpServlet{

	public LPLogServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//Here username and password are the names which I have given in the input box in Login.jsp page. Here I am retrieving the values entered by the user and keeping in instance variables for further use.

	String eid = request.getParameter("eId");
	String password = request.getParameter("password");

	LP loginBean = new LP(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.

	loginBean.seteId(eid); //setting the username and password through the loginBean object then only you can get it in future.
	loginBean.setPassword(password);

	LPService loginDao = new LPServiceImp(); //creating object for LoginDao. This class contains main logic of the application.

	String userValidate = loginDao.validateLPLogin(loginBean); //Calling authenticateUser function

	if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
	{
	HttpSession session= request.getSession();
	session.setAttribute("eId",eid); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
	request.getRequestDispatcher("/LPHome.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
	
	}
	else
	{
	request.setAttribute("errMessage", userValidate); //If authenticateUser() function returns other than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
	request.getRequestDispatcher("/LPLog.jsp").forward(request, response);//forwarding the request
	}
	}

	
}
