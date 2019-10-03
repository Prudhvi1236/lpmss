package com.lpms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.lpms.dbConnection.*;
import com.lpms.model.LP;
import com.lpms.model.Mentor;
import com.lpms.model.Venue;



public class MentorDaoImp implements MentorDao{
	private static Logger log = Logger.getRootLogger();
	
	@Override
	public String addMentor(Mentor m) {
		 		
		String eid = m.geteId();
		String name = m.getName();
		String email = m.getEmail();
		String password = m.getPassword();
		long phno = m.getPhno();
		
		  Connection con=null;
		  PreparedStatement stmt= null;
			 ResultSet resultSet = null;
			 
		String query = "insert into mentor values(?,?,?,?,?)";
		StartConnection s = new StartConnection();
		try 
		{
			con = StartConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,eid);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.setLong(5,phno);

			int i= ps.executeUpdate();
			
			if (i!=0)  
			return "successfully done...."; 
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";  
			
	}

			
	@Override
	public String validateMentorLogin(Mentor loginBean) {
		String eId = loginBean.geteId();
		 String password = loginBean.getPassword();
		 
	      Connection con=null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		 
		String eidDb = "";
		 String passwordDB = "";
		 
		try
		 {
		 con = StartConnection.createConnection();
		 statement=con.createStatement();
		 resultSet = statement.executeQuery("select eid ,password from mentor"); 
		 
		while(resultSet.next()) 		 {
			eidDb = resultSet.getString("eId"); 
			passwordDB = resultSet.getString("password");
		 
		   if(eId.equals(eidDb) && password.equals(passwordDB))
		   {
		      return "SUCCESS"; 
		   }
		 }
		 }
		 catch(SQLException e)
		 {
		 e.printStackTrace();
		 }
		 return "Invalid user credentials"; 
		 }


	@Override
	public List<Mentor> viewMentor() {
		Connection con=null;
		PreparedStatement stmt= null;
	    ResultSet resultSet = null;
		
		List <Mentor> mentorlist = new ArrayList();
		StartConnection s = new StartConnection();
		String query = "select * from mentor ";
		try
		{
			con = StartConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			
			
			resultSet= ps.executeQuery();
		
			if(resultSet.next())
			{
				Mentor m = new Mentor();
				m.seteId(resultSet.getString(1));
				m.setName(resultSet.getString(2));
				m.setEmail(resultSet.getString(3));
				m.setPassword(resultSet.getString(4));
				m.setPhno(resultSet.getInt(5));
				mentorlist.add(m);
			}
			con.close();
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} 		
		return mentorlist;

	}
	
	
	@Override
	public Mentor findById(String eId) {

		
		Mentor mentorbean = new Mentor();
		Connection con=null;
		PreparedStatement ps= null;
		ResultSet resultSet = null;

		String query ="select * from mentor where eid=?";
		try {
			con=StartConnection.createConnection();

			ps=con.prepareStatement(query);
			ps.setString(1, eId);

			resultSet=ps.executeQuery();
			if(resultSet.next())
			{
				mentorbean.seteId(resultSet.getString("eId"));
				mentorbean.setName(resultSet.getString("name"));
				mentorbean.setEmail(resultSet.getString("email"));
				mentorbean.setPassword(resultSet.getString("password"));
				mentorbean.setPhno(resultSet.getLong("phno"));

			}
			else
			{
				log.error("nod data found for mentor id "+ eId);
				throw new Exception("no data found for mentor id "+ eId);  
			}
			//log.trace("creating lp with "+ userid+name+email+phno);
			//LP lp= new LP(userid,name,email,password,phno);		
			return mentorbean;
		}
		catch (SQLException e) {

			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;


	}
	
	
	
}
	 
	
	
	
	

