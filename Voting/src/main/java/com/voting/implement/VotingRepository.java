package com.voting.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VotingRepository extends JpaRepository<Voting, Integer> {
	@Query(value = "select * from voters where gender = ?", nativeQuery = true)
	public List<Voting> getBy(String name);

	@Query(value = "select * from voters where age like ?", nativeQuery = true)
	public List<Voting> getsAge(int age);

	@Query(value = "select * from voters where age >? ", nativeQuery = true)
	public List<Voting> getMax(int age);

	@Query(value = "select * from  voters where age >=? and age <=?", nativeQuery = true)
	public List<Voting> getRange(int age1, int age2);

	@Query(value = "Select max(age) from voters", nativeQuery = true)
	public Integer getMax();

	@Query(value = "select * from voters where age=(select max(age) from voters)", nativeQuery = true)
	public Voting getmaxObj();

	@Query(value = "select min(age) from voters", nativeQuery = true)
	public Integer getMin();

	@Query(value = "select * from voters where   age=(select min(age)  from voters )", nativeQuery = true)
	public List<Voting> getMinObj();
 @Query(value="select * from voters",nativeQuery=true)
	public List<Voting> getAllByQ();



 @Query(value="select * from voters where name like ?",nativeQuery=true)
 public Optional<Voting> getNameByQuery(String name);
}
