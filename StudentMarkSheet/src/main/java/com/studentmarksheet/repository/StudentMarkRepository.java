package com.studentmarksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmarksheet.entity.StudentMark;

public interface StudentMarkRepository extends JpaRepository<StudentMark, Integer>{

}
