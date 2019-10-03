package com.lpms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.lpms.dbConnection.StartConnection;
import com.lpms.model.Batch;
import com.lpms.model.LP;
import com.lpms.model.Module;
import com.lpms.model.Venue;

public class BatchDaoImp implements BatchDao {
	private static Logger log = Logger.getRootLogger();

	@Override
	public String addBatch(Batch b) {

		int i=0;
		String batchid = b.getBatchId();
		String batchcourse = b.getBatchCourse();
		String eid = b.geteId();
		int batchcapacity = b.getBatchCapacity();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		String query = "insert into batch (batchid,batchcourse,eid,batchcapacity)values(?,?,?,?)";
		StartConnection s = new StartConnection();
		try {
			con = StartConnection.createConnection();
			PreparedStatement ps = con.prepareStatement("select * from batch where eid=?");
			ps.setString(1,eid);
			resultSet=ps.executeQuery();
			System.out.println("hello"+resultSet.next()+eid);
			if(resultSet.next()==false)
			{
			ps = con.prepareStatement(query);
			ps.setString(1, batchid);
			System.out.println(batchid);
			ps.setString(2, batchcourse);
			ps.setString(3, eid);
			ps.setInt(4, batchcapacity);

			i = ps.executeUpdate();
			//System.out.println(batchid);
			return "SUCCESS";
			}
			else
			{
				return "You have already a batch....";
			}
				
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return "Already a batch created with same id...";
		}

	}

	@Override
	public String allocateVenue(Batch b) {

		 Connection con=null;
		  PreparedStatement ps= null;
		  ResultSet resultSet = null;
		  try 
			{	 
		String query = "update batch set venueid=? where Batchid=?";
		StartConnection s = new StartConnection();
		
			con = StartConnection.createConnection();
		    ps=con.prepareStatement(query);
			ps.setString(2,b.getBatchId());
			ps.setInt(1,b.getVenueId());
			int i=ps.executeUpdate();
			return "successfully done....";
			
			
			}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Oops error occurred" ;

		
	}

	@Override
	public List<Batch> getBatchRecords() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		List<Batch> batchlist = new ArrayList();
		StartConnection s = new StartConnection();
		String query = "select * from batchrecords";
		try {
			con = StartConnection.createConnection();
			PreparedStatement ps = con.prepareStatement(query);

			resultSet = ps.executeQuery();

		   while (resultSet.next()) {
				Batch b = new Batch();
				b.setBatchId(resultSet.getString(1));
				b.setBatchCourse(resultSet.getString(2));
				b.seteId(resultSet.getString(3));
				b.setVenueId(resultSet.getInt(4));
				b.setBatchCapacity(resultSet.getInt(5));
				batchlist.add(b);
			}
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return batchlist;

	}

	@Override
	public String batchRecords(Batch b) {
		int i=0;
		String batchid = b.getBatchId();
		String batchcourse = b.getBatchCourse();
		String eid = b.geteId();
		int batchcapacity = b.getBatchCapacity();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		String query = "insert into batchrecords (batchid,batchcourse,eid,batchcapacity)values(?,?,?,?)";
		StartConnection s = new StartConnection();
		try {
			con = StartConnection.createConnection();
			PreparedStatement ps = con.prepareStatement("select *from batchrecords where eid=?");
			ps.setString(1,eid);
			resultSet=ps.executeQuery();
			
			if(resultSet.next()==false)
			{
			ps = con.prepareStatement(query);
			ps.setString(1, batchid);
			ps.setString(2, batchcourse);
			ps.setString(3, eid);
			ps.setInt(4, batchcapacity);

			i = ps.executeUpdate();
			return "SUCCESS";
			}
			else
			{
				return "You have already a batch....";
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
			return "Already batch created...";
		}


	}

	@Override
	public Batch findByBatchId(String batchId) {

		
		Venue v = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		Statement st = null;
		String query = "select batchcourse,batch.venueid,venueaddress from batch right join venue on batch.venueid = venue.venueid where batchid='"+batchId+"'";
		try {
			Batch batchbean = null;

			con = StartConnection.createConnection();
			st=con.createStatement();
			log.trace(batchId);
			resultSet = st.executeQuery(query);
			log.trace(batchId);

			if (resultSet.next()) {
				batchbean = new Batch();
				v= new Venue();
				log.trace(resultSet.getString("venueaddress"));
				v.setVenueAddress(resultSet.getString("venueaddress"));
				batchbean.setVenue(v);
				// batchbean.v.setVenueAddress(resultSet.getString("venueaddress"));
				batchbean.setVenueId(resultSet.getInt("venueid"));
				batchbean.setBatchCourse(resultSet.getString("batchcourse"));
				//batchbean.setBatchId(resultSet.getString("batchid"));

			} 
			else
			{
				log.error("no data found for lp id " + batchId);
				throw new Exception("no data found for lp id " + batchId);
				
			}

			return batchbean;
		} 
		catch (SQLException e) {

			e.printStackTrace();
			return null;
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Batch findByMentorId(String mentorId) 
	{
		Batch batchbean = null;
		Connection con=null;
		PreparedStatement ps= null;
		ResultSet resultSet = null;

		String query ="select * from batch where eid=?";
		try {
			con=StartConnection.createConnection();

			ps=con.prepareStatement(query);
			ps.setString(1, mentorId);

			resultSet=ps.executeQuery();
			if(resultSet.next())
			{
				batchbean=new Batch();
				
				batchbean.setBatchId(resultSet.getString("batchid"));
				batchbean.setBatchCourse(resultSet.getString("batchcourse"));
				batchbean.seteId(resultSet.getString("eid"));
				batchbean.setVenueId(resultSet.getInt("venueid"));
				batchbean.setBatchCapacity(resultSet.getInt("batchcapacity"));

			}
			else
			{
				log.error("nod data found for mentor id "+ mentorId);
				throw new Exception("no data found for lp id "+ mentorId);  
			}
			return batchbean;
		}
		catch (SQLException e) {

			e.printStackTrace();
			return null;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;

		
	}

	@Override
	public List<Batch> getNotAllocBatchRecords() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		List<Batch> batchlist = new ArrayList();
		StartConnection s = new StartConnection();
		String query = "select * from batch where venueid is null";
		try {
			con = StartConnection.createConnection();
			PreparedStatement ps = con.prepareStatement(query);

			resultSet = ps.executeQuery();

			while (resultSet.next()) {
				Batch b = new Batch();
				b.setBatchId(resultSet.getString(1));
				b.setBatchCourse(resultSet.getString(2));
				b.seteId(resultSet.getString(3));
				b.setVenueId(resultSet.getInt(4));
				b.setBatchCapacity(resultSet.getInt(5));
				batchlist.add(b);
			}
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return batchlist;

	}

	@Override
	public boolean deleteBatch(Batch b) 
	{
		
		Connection con=null;
		  PreparedStatement ps= null;
		  ResultSet resultSet = null;
		  try 
			{	 
		String query = "delete from batch where eid=? and batchid=?";
		StartConnection s = new StartConnection();
		
			con = StartConnection.createConnection();
		    ps=con.prepareStatement(query);
			ps.setString(2,b.getBatchId());
			ps.setString(1,b.geteId());
			if( ps.executeUpdate()==1) {
				return true;
			}
			
			
			con.close();
			}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;

		
	}
	
	@Override
	public Batch findByMenId(String eId) {

		
		Batch batchbean = new Batch();
		Venue v = null;
		Connection con=null;
		PreparedStatement ps= null;
		ResultSet resultSet = null;

		String query ="select eid,batchid,batchcourse,batchcapacity,venueaddress from batch right join venue on batch.venueid = venue.venueid where eid=?";
		try {
			con=StartConnection.createConnection();

			ps=con.prepareStatement(query);
			ps.setString(1, eId);

			resultSet=ps.executeQuery();
			if(resultSet.next())
			{
				batchbean.seteId(resultSet.getString("eId"));
				batchbean.setBatchId(resultSet.getString("batchid"));
				batchbean.setBatchCourse(resultSet.getString("batchcourse"));
				batchbean.setBatchCapacity(resultSet.getInt("batchcapacity"));
				v= new Venue();
				log.trace(resultSet.getString("venueaddress"));
				v.setVenueAddress(resultSet.getString("venueaddress"));
				batchbean.setVenue(v);

			}
			else
			{
				log.error("nod data found for mentor id "+ eId);
				throw new Exception("no data found for mentor id "+ eId);  
			}
					
			return batchbean;
		}
		catch (SQLException e) {

			e.printStackTrace();
			return null;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;


	}


}
