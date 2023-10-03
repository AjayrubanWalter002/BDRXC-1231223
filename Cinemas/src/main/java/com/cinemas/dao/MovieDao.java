package com.cinemas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cinemas.customexception.IdNotFound;
import com.cinemas.entity.Movie;
import com.cinemas.repository.MovieRepository;

@Repository
public class MovieDao {
@Autowired
MovieRepository mr;
	public String setMovie(Movie m) {
		mr.save(m);
		return "Saved Successfully";
	}
	public String setAll(List<Movie> a) {
		mr.saveAll(a);
		return "Saved all the details Successfully";
	}

	public Movie getbyId(int a) throws IdNotFound {
		return mr.findById(a).orElseThrow(()->new IdNotFound());
	}
	public List<Movie> getAll() {
		return mr.findAll();
	}
	public List<Movie> getbyYear(int year) {
		return mr.getbyYear(year);
	}
	}
	
	
