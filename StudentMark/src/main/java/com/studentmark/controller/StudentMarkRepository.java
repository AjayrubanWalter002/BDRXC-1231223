package com.studentmark.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmark.entity.StudentMark;

public interface StudentMarkRepository extends JpaRepository<StudentMark, Integer>{

	@Query(value="select total_mark from student_mark where roll_no = ?", nativeQuery = true)
	int getByRoll(int roll);

}
