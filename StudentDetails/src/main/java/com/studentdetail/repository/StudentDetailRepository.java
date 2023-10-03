package com.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdetail.entity.Student;

public interface StudentDetailRepository extends JpaRepository<Student, Integer>{

}
