package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
	private int rollNo;
	private String std;
	  private int age;
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

}
