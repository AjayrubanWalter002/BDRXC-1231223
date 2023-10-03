package com.voting.implement;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="voters")
public class Voting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Required
    private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private String gender;
//	public Voting(int id, int age,String name, String gender) {
//		super();
//		this.id = id;
//		this.age=age;
//		this.name = name;
//		this.gender = gender;
//	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	
	}
}
