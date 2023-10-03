package com.shirt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shirt")
public class Shirt {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private int hsn;
private String brand;
private String color;
private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getHsn() {
	return hsn;
}
public void setHsn(int hsn) {
	this.hsn = hsn;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
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
}
