package com.entityrelationship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String empName;
 private String designation;
 private AccountDetails accountDetails;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return empName;
}
public void setName(String name) {
	this.empName = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public AccountDetails getAccountDetails() {
	return accountDetails;
}
public void setAccountDetails(AccountDetails accountDetails) {
	this.accountDetails = accountDetails;
}
 
}
