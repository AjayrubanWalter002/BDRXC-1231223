package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cinema.entity.Movie;
import com.cinema.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	MovieService ms;
	@PostMapping("/set")
public String set(@RequestBody Movie m) {
	return ms.set(m);
}
}
