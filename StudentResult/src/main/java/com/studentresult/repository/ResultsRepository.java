package com.studentresult.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentresult.entity.Results;

public interface ResultsRepository extends JpaRepository<Results,Integer>{

@Query(value="select * from student.result where total_marks = (select max(total_Marks) from student.result)",nativeQuery=true)
public Results getTopper();
@Query(value="select top 3 * from student.result where student.result <= total_Marks order by student.result desc",nativeQuery=true)
public List<Results> gettopThree();
@Query(value="select * from student.result where total_marks, desc ?",nativeQuery=true)
public List<Results> orderDesc();
}
//"select * from bike_detail where price= (select max(price) from bike_detail
//"SELECT TOP 25 * FROM Arcust a WHERE a.arcustno <= :arcustno ORDER BY a.arcustno DESC")
//select * from student.res by total_marks,desc;
//select * from stu,res where totalmarks <200;