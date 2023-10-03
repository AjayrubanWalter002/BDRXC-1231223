package com.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.MovieDao;
import com.cinema.entity.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDao md;
public String set(Movie m) {
	return md.set(m);
}
}
