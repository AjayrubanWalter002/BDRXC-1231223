package com.example.entity;


public class Voter {
  private int age;
  private String name;
  private String gender;
  private String city;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public Voter(int age, String name, String gender, String city) {
	super();
	this.age = age;
	this.name = name;
	this.gender = gender;
	this.city = city;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
