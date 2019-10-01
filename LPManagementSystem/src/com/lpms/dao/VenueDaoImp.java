package com.lpms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lpms.dbConnection.StartConnection;
import com.lpms.model.Venue;

public class VenueDaoImp implements VenueDao
{

	@Override
	public String addVenue(Venue v) 
	{
		int venueid = v.getVenueId();
		String venueaddress = v.getVenueAddress();
		int capacity = v.getCapacity();
		
		     Connection con=null;
		     PreparedStatement stmt= null;
			 ResultSet resultSet = null;
			 
		String query = "insert into venue values(?,?,?)";
		StartConnection s = new StartConnection();
		try 
		{
			con = StartConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,venueid);
			ps.setString(2,venueaddress);
			ps.setInt(3,capacity);
			
			int i= ps.executeUpdate();
			
			if (i!=0)  
			return "SUCCESS"; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";  
	
	}

	@Override
	public List<Venue> viewVenue() {
		
		Connection con=null;
		PreparedStatement stmt= null;
	    ResultSet resultSet = null;
		
		List <Venue> venuelist = new ArrayList();
		StartConnection s = new StartConnection();
		String query = "select * from venue";
		try
		{
			con = StartConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			
			
			resultSet= ps.executeQuery();
		
			while(resultSet.next())
			{
				Venue v = new Venue();
				v.setVenueId(resultSet.getInt(1));
				v.setVenueAddress(resultSet.getString(2));
				v.setCapacity(resultSet.getInt(3));
				
				venuelist.add(v);
			}
			con.close();
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} 		
		return venuelist;

	}
  
}
