package com.cinemas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String heroName;
private String dirName;
private int releasedYear;
private int noOfSongs;
private float rating;
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
public String getHeroName() {
	return heroName;
}
public void setHeroName(String heroName) {
	this.heroName = heroName;
}
public String getDirName() {
	return dirName;
}
public void setDirName(String dirName) {
	this.dirName = dirName;
}
public int getReleasedYear() {
	return releasedYear;
}
public void setReleasedYear(int releasedYear) {
	this.releasedYear = releasedYear;
}
public int getNoOfSongs() {
	return noOfSongs;
}
public void setNoOfSongs(int noOfSongs) {
	this.noOfSongs = noOfSongs;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
}
