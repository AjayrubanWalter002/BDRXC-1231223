package com.studentmark;

import jakarta.persistence.Entity;


public class ObjClass {
	
	 private int id;
		private int rollNo;
	  public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
	private String stuName;
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String std;
	  private int age;
	}
