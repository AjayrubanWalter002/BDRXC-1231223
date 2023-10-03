package com.schoolmark;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mark")
public class Mark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollNo;
	private int tamilMark;
	private int englishMark;
	private int mathsMark;
	private int socialMark;
	private int scienceMark;
	private int totalMark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollNo;
	}

	public void setRollno(int rollno) {
		this.rollNo = rollno;
	}

	public int getTamilMark() {
		return tamilMark;
	}

	public void setTamilMark(int tamilMark) {
		this.tamilMark = tamilMark;
	}

	public int getEnglishMark() {
		return englishMark;
	}

	public void setEnglishMark(int englishMark) {
		this.englishMark = englishMark;
	}

	public int getMathsMark() {
		return mathsMark;
	}

	public void setMathsMark(int mathsMark) {
		this.mathsMark = mathsMark;
	}

	public int getSocialMark() {
		return socialMark;
	}

	public void setSocialMark(int socialMark) {
		this.socialMark = socialMark;
	}

	public int getScienceMark() {
		return scienceMark;
	}

	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

}
