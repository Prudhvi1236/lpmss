package com.lpms.dao;

import java.util.List;

import com.lpms.model.LP;


public interface LPDao 
{
	public String addLP(LP lp);
	public String validateLPLogin(LP loginBean);
	LP findById(String eId);
	public List<LP> viewLP();
	LP updateProfile(LP lp);
}
