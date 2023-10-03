package com.cinemas.controller;

import java.util.List;

import org.hibernate.id.IdentifierGenerationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.customexception.IdNotFound;
import com.cinemas.customexception.NameException;
import com.cinemas.customexception.YearException;
import com.cinemas.entity.Movie;
import com.cinemas.service.MovieService;

@RestController
@CrossOrigin
public class MovieController {
	@Autowired
	MovieService ms;
	@PostMapping("/setMovie")
	public String setMovie(@RequestBody Movie m) throws Exception{
		return ms.setMovie(m);
	}
	@PostMapping("/setAllMovie")
		public String setAll(@RequestBody List<Movie> a) throws YearException{
			return ms.setAll(a);
		}
	@GetMapping("/getById/{name}")
	public Movie getbyId(@PathVariable int name) throws IdNotFound{
		return ms.getbyId(name);
	}
	@GetMapping("getAllMovie")
	public List<Movie> getAll(){
		return ms.getAll();
	}
	@GetMapping("getByName/{name}")
	public List<Movie> getbyName(@PathVariable String name) {
		return ms.getbyName(name);
}
	@GetMapping("/getByYear/{year}")
	public List<Movie> getbyYear(@PathVariable int year) throws YearException {
		return ms.getbyYear(year);
	}
	@GetMapping("getbyName/{name}")
	public List<Movie> getbyNames(@PathVariable String name) throws NameException{
		return ms.getbyNames(name);
	}
	@GetMapping("getByHero/{name}")
	public List<Movie> getbyHero(@PathVariable String name)throws NameException{
		return ms.getbyHero(name);
	}
	
 }



