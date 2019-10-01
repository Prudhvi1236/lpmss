package com.lpms.model;

public class LP {
	public String eId;
	public String name;
	public String email;
	public String password;
	public long phno;
	public String batchId;
	
	
	
	
	public LP(String eId, String name, String email, String password, long phno) {
		super();
		this.eId = eId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "LP [eId=" + eId + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", phno=" + phno + ", batchId="
				+ batchId + "]";
	}
	public LP() {
		// TODO Auto-generated constructor stub
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	
	
}
