package com.details.Entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@NoArgsConstructor
@AllArgsConstructor
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int age;
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName ="id",name = "adrs")
	private Address address;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Details(int id, String name, String gender, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	

}
