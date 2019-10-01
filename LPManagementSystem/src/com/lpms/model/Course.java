package com.lpms.model;

public class Course {
	private String cId;
	private String courseName;
	private Course(String cId, String courseName)
	{
		super();
		this.cId = cId;
		this.courseName = courseName;
	}
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

}
