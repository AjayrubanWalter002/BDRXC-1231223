package com.excel.Entity;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student_sheet")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private long rollNo;
   private String studentName;
   private int totalMarks;
    private String result;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return studentName;
	}
	public void setName(String name) {
		this.studentName = name;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
