package com.cinemas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cinemas.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
@Query(value="select * from movie where released_year = ?",nativeQuery=true)
	public List<Movie> getbyYear(int year);

}
