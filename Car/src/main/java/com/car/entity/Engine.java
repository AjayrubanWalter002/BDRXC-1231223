package com.car.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="engine_details")
public class Engine {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int engid;
	private int noOfPistons;
	private int price;
	private int model;
	public int getId() {
		return engid;
	}
	public void setId(int id) {
		this.engid = id;
	}
	public int getNoOfPistons() {
		return noOfPistons;
	}
	public void setNoOfPistons(int noOfPistons) {
		this.noOfPistons = noOfPistons;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
}
