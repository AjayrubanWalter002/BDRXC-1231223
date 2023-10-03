package com.schoolfinal;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollNo;
	private String name;
	private int average;
	private int totalmark;
	public int getTotalmark() {
		return totalmark;
	}
	public void setTotalmark(int totalmark) {
		this.totalmark = totalmark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
  
}
