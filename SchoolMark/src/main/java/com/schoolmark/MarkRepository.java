package com.schoolmark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarkRepository extends JpaRepository<Mark, Integer>{
	@Query(value="select total_mark from mark where roll_no=?",nativeQuery=true)
	public int getbyRoll(int rollNo);
}
