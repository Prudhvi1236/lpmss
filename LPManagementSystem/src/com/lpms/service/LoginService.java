package com.lpms.service;



public class LoginService 
{
	
	public boolean validateAdminLogin(String userid,String password)
	{
		String eid="admin";
		String pass2="admin";
		
		
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
