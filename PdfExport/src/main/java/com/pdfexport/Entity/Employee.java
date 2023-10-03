package com.pdfexport.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  @Column(name="firstname")
  private String firstName;
  @Column(name="lastname")
  private String lastName;
  public void setFirstName(String firstName) {
	  this.firstName=firstName;
  }
  public String getFirstName() {
	  return firstName;
  }
  public void setLastName(String lastName) {
	  this.lastName=lastName;
  }
  public String getLastName() {
	  return lastName;
  }
  public void setId(int id) {
	  this.id=id;
  }
  public int getId() {
	  return id;
  }
  public Employee(String firstName,String lastName) {
	  
	  this.firstName=firstName;
	  this.lastName=lastName;
  }
  public Employee() {
  }
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}
  
}
