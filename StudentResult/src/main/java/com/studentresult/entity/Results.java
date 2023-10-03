package com.studentresult.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="result")
public class Results {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private int rollNumber;
private int totalMarks;
private int percentage;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
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

}
