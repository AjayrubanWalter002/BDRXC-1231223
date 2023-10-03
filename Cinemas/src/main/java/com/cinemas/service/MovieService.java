package com.cinemas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cinemas.customexception.IdNotFound;
import com.cinemas.customexception.NameException;
import com.cinemas.customexception.YearException;
import com.cinemas.dao.MovieDao;
import com.cinemas.entity.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDao md;

	public String setMovie(Movie m) throws YearException {
		// try {
		if (m.getReleasedYear() <= 2023) {
			return md.setMovie(m);
		} else {
			throw new YearException("invalid");
		}
	}

	// catch(Exception j) {
	// j.printStackTrace();
	// return "invalid";
	// }

// }
	public String setAll(List<Movie> j) throws YearException {
		List<Movie> x = j.stream().filter(k -> k.getReleasedYear() >= 2024).collect(Collectors.toList());
		// try {
		if (x.isEmpty()) {
			return md.setAll(j);
		} else {
			throw new YearException("invalid");
		}
	}// catch(Exception h) {
		// return "doesn't exist";
		// }

//}
	public Movie getbyId(int name) throws IdNotFound {
		return md.getbyId(name);
	}

	public List<Movie> getAll() {
		return md.getAll();
	}

	public List<Movie> getbyName(String name) {
		List<Movie> x = getAll();
		List<Movie> y = x.stream().filter(v -> v.getName().equals(name)).collect(Collectors.toList());
		return y;

	}

	public List<Movie> getbyYear(int year) throws YearException {

		List<Movie> x = md.getbyYear(year);

		if (x.isEmpty()) {
			throw new YearException(
					"																																																														Anvalid");
		} else {
			return x;
		}

	}

	public List<Movie> getbyNames(String name) throws NameException {
		List<Movie> y = getAll();
		List<Movie> z = y.stream().filter(f -> f.getName().equals(name)).collect(Collectors.toList());
		if (z.isEmpty()) {
			throw new NameException();
		} else {

			return z;
		}

	}

	public List<Movie> getbyHero(String name) throws NameException {

		List<Movie> y = getAll();
		List<Movie> z = y.stream().filter(f -> f.getHeroName().equals(name)).collect(Collectors.toList());
		if (z.isEmpty()) {
			throw new NameException();
		} else {
			return z;
		}
	}

}
