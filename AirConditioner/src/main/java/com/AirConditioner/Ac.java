package com.AirConditioner;


import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
@Table(name="ac_details")
public class Ac {
@Id   
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id; 
private String brand;

@Value("${Ac.model}")
private String model;
private String review;
@Transient
private int noOfWings;
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
private String color;
private int price;
private int tax;
private int netPrice;
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
private String capacity;
private float starRating;
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
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getStarRating() {
	return starRating;
}
public void setStarRating(float starRating) {
	this.starRating = starRating;
}

}
