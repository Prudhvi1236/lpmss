package com.lpms.service;

import java.sql.Connection;

import java.sql.PreparedStatement;


import com.lpms.dao.MentorDao;
import com.lpms.dao.MentorDaoImp;

import com.lpms.model.Mentor;

public class LoginService 
{
	//private Connection conn=null;
	//PreparedStatement ps=null;
	//MentorDao m=new MentorDaoImp();
	//public String validateMentorLogin(Mentor m2)
	//{
		//return m.validateMentorLogin(m2);
	//}
	public boolean validateAdminLogin(String userid,String password)
	{
		String eid="admin";
		String pass2="admin";
		
		//String user1 = lp.getEId();
		//String pass1 = lp.getPassword();
		boolean status = false;
		if(eid.equals(userid)&&pass2.equals(password))
		{
			status = true;
			return status;
		}
		else
		{
			return status;
		}
	}
}
