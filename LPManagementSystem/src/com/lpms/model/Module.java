package com.lpms.model;

public class Module {
	private int moId;
	private String moduleName;
	private String date;
	private String batchId;
	
		
	public Module() {
		// TODO Auto-generated constructor stub
	}
	public Module(int moduleid, String modulename2, String date2,
			String batchid2) {
		// TODO Auto-generated constructor stub
	}
	public int getMoId() {
		return moId;
	}
	public void setMoId(int moId) {
		this.moId = moId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	

}
