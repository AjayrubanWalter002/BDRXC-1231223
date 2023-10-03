package com.excel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.excel.Entity.*;
public interface StudentRepository extends JpaRepository<Student,Integer>{
}
