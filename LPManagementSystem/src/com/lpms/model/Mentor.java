package com.lpms.model;

public class Mentor 
{
	private String eId;
	private String name;
	private String email;
	private String password;
	private long phno;
	
	
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
	public long setPhno(long phno) {
		return this.phno = phno;
	}
	
	
}
