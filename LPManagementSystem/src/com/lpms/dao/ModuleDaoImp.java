package com.lpms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.lpms.dbConnection.StartConnection;

import com.lpms.model.Module;

public class ModuleDaoImp implements ModuleDao {
	private static Logger log = Logger.getRootLogger();

	@Override
	public String createModule(Module mo) {
		int moid = mo.getMoId();
		String modulename = mo.getModuleName();
		String date = mo.getDate();
		String batchid = mo.getBatchId();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		String query = "insert into module values(?,?,?,?)";
		StartConnection s = new StartConnection();
		try {
			con = StartConnection.createConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, moid);
			ps.setString(2, modulename);
			ps.setString(3, date);
			ps.setString(4, batchid);

			int i = ps.executeUpdate();

			if (i != 0)
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";

	}

	@Override
	public List<Module> viewModule(String batchId) {

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		StartConnection s = new StartConnection();
		List<Module> modulelist = new ArrayList();
		String query = "select * from module where batchid=? ";
		Module v = null;
		try {
			con = StartConnection.createConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, batchId);

			resultSet = ps.executeQuery();
			log.trace("this is ");
			while (resultSet.next()) {
				v = new Module();
				v.setMoId(resultSet.getInt(1));
				log.debug("moid" + resultSet.getInt(1));

				v.setModuleName(resultSet.getString(2));
				v.setDate(resultSet.getString(3));
				log.debug("moid" + resultSet.getInt(1));
				modulelist.add(v);
			}
			//System.out.println(modulelist);
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return modulelist;

	}

	
}
