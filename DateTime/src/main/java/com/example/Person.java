package com.example;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "/detailsName")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creationTime")
	private DateTime creationTime;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateTime")
	private DateTime updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTime getTime() {
		return creationTime;
	}

	public void setTime(DateTime time) {
		creationTime = time;
	}

	@PrePersist
	public void onSave() {
		DateTime currentDateTime = new DateTime();
		this.creationTime = currentDateTime;
		this.updateTime = currentDateTime;
	}

	@PostPersist
	public void onUpdate() {
		DateTime currentDateTime = new DateTime();
		this.updateTime = currentDateTime;
	}
}
