package com.studentresult.entity;

public class StudentMarkSheet {
	private int id;
	private int rollNumber;
	private String name;
	private int totalMarks;
	private int percentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	private int sem1Theory;
	private int sem1Practicals;
	private int sem2Theory;
	private int sem2Practicals;
	private int sem1Total;
	private int sem2Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSem1Theory() {
		return sem1Theory;
	}
	public void setSem1Theory(int sem1Theory) {
		this.sem1Theory = sem1Theory;
	}
	public int getSem1Practicals() {
		return sem1Practicals;
	}
	public void setSem1Practicals(int sem1Practicals) {
		this.sem1Practicals = sem1Practicals;
	}
	public int getSem2Theory() {
		return sem2Theory;
	}
	public void setSem2Theory(int sem2Theory) {
		this.sem2Theory = sem2Theory;
	}
	public int getSem2Practicals() {
		return sem2Practicals;
	}
	public void setSem2Practicals(int sem2Practicals) {
		this.sem2Practicals = sem2Practicals;
	}
	public int getSem1Total() {
		return sem1Total;
	}
	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}
	public int getSem2Total() {
		return sem2Total;
	}
	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}

}
