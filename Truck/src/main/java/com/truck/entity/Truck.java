package com.truck.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="/truck")
public class Truck {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String brand;
private String model;
private String transmission;
private int noOfWheels;
private int  price;
private int tax;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getTransmission() {
	return transmission;
}
public void setTransmission(String transmission) {
	this.transmission = transmission;
}
public int getNoOfWheels() {
	return noOfWheels;
}
public void setNoOfWheels(int noOfWheels) {
	this.noOfWheels = noOfWheels;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
public int getNetPrice() {
	return netPrice;
}
public void setNetPrice(int netPrice) {
	this.netPrice = netPrice;
}
private int netPrice;
}
