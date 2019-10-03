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
import com.lpms.model.LP;
import com.lpms.model.Mentor;
import com.lpms.model.Venue;

public class LPDaoImp implements LPDao { 
	private static Logger log = Logger.getRootLogger();
	@Override
	public String addLP(LP lp)
	{

		String eid = lp.geteId();
		String name = lp.getName();
		String email = lp.getEmail();
		String password = lp.getPassword();
		long phno = lp.getPhno();
		String batchid = lp.getBatchId();

		Connection con=null;
		PreparedStatement stmt= null;
		ResultSet resultSet = null;

		String query = "insert into lp values(?,?,?,?,?,?)";
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
			ps.setString(6, batchid);

			int i= ps.executeUpdate();

			if (i!=0)  
				return "successfully done..."; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";  

	}


	public String validateLPLogin(LP loginBean)
	{
		String eId = loginBean.geteId(); //Keeping user entered values in temporary variables.
		String password = loginBean.getPassword();
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String userIdDb = "";
		String passwordDB = "";
		try
		{
			con = StartConnection.createConnection(); //establishing connection
			statement = con.createStatement(); //Statement is used to write queries. Read more about it.
			resultSet = statement.executeQuery("select eid,password from lp"); //Here table name is mentors and eid,password are columns. fetching all the records and storing in a resultSet.
			while(resultSet.next()) // Until next row is present otherwise it return false
			{
				userIdDb = resultSet.getString("eId"); //fetch the values present in database
				passwordDB = resultSet.getString("password");
				if(eId.equals(userIdDb) && password.equals(passwordDB))
				{
					return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Invalid user credentials"; // Just returning appropriate message otherwise

	}


	@Override
	public List<LP> viewLP() {

		Connection con=null;
		PreparedStatement stmt= null;
		ResultSet resultSet = null;

		List <LP> lplist = new ArrayList();
		StartConnection s = new StartConnection();
		String query = "select * from LP ";
		try
		{
			con = StartConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);


			resultSet= ps.executeQuery();

			if(resultSet.next())
			{
				LP lp = new LP();
				lp.seteId(resultSet.getString(1));
				lp.setName(resultSet.getString(2));
				lp.setEmail(resultSet.getString(3));
				lp.setPassword(resultSet.getString(4));
				lp.setPhno(resultSet.getInt(5));
				lp.setBatchId(resultSet.getString(6));
				lplist.add(lp);
			}
			con.close();

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} 		
		return lplist;

	}




	@Override
	public LP findById(String eId) {

		
		LP lp = new LP();
		Connection con=null;
		PreparedStatement ps= null;
		ResultSet resultSet = null;

		String query ="select * from lp where eid=?";
		try {
			con=StartConnection.createConnection();

			ps=con.prepareStatement(query);
			ps.setString(1, eId);

			resultSet=ps.executeQuery();
			if(resultSet.next())
			{
				lp.seteId(resultSet.getString("eId"));
				lp.setName(resultSet.getString("name"));
				lp.setEmail(resultSet.getString("email"));
				lp.setPassword(resultSet.getString("password"));
				lp.setPhno(resultSet.getLong("phno"));
				lp.setBatchId(resultSet.getString("batchid"));
			}
			else
			{
				log.error("nod data found for lp id "+ eId);
				throw new Exception("no data found for lp id "+ eId);  
			}
					
			return lp;
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


	@Override
	public LP updateProfile(LP lp) {

		Connection con=null;
		PreparedStatement ps= null;
		ResultSet resultSet = null;
		Statement st = null;
		String query ="update lp set name=?,email=?,password=?,phno=? where eid=?";


		try {
			con= StartConnection.createConnection();
			ps = con.prepareStatement(query);
			ps.setString(5, lp.geteId());
			ps.setString(1, lp.getName());
			ps.setString(2, lp.getEmail());
			ps.setString(3, lp.getPassword());
			ps.setLong(4, lp.getPhno());

			ps.executeQuery();
			ps.close();

			System.out.print("User with id " + lp.getEmail() + " was updated");

		} 


		catch (SQLException e) {

			e.printStackTrace();

		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.commit();
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		return lp;

	}

}


