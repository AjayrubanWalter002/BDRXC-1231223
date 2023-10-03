package com.car.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cars_details")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String brand;
private String model;
private int price;
//@OneToOne(targetEntity = Engine.class,cascade = CascadeType.ALL)
//@JoinColumn(name="Engine",referencedColumnName ="id")
private Engine engine;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
//public Engine getEngine() {
//	return engine;
//}
//public void setEngine(Engine engine) {
//	this.engine = engine;
//}
}
