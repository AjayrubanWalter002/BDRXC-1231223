package com.cinema.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Movie;
import com.cinema.repository.MovieRepository;

@Repository
public class MovieDao {
	@Autowired
	MovieRepository mr;
public String set(Movie m) {
	mr.save(m);
	return "Saved Successfully";
}
}
