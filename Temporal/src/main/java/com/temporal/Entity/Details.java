package com.temporal.Entity;

import java.sql.Date;

import org.joda.time.DateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "/detailsname")
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private int age;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "Created_Time")
	private DateTime creationTime;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "Updated_Time")
	public DateTime updatedTime;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Details(int id, String name, int age, DateTime creationTime, DateTime updatedTime) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.creationTime = creationTime;
		this.updatedTime = updatedTime;
	}

}
