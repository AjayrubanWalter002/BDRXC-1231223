package com.voting.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class VotingDao {
	@Autowired
	VotingRepository repo;

	public String setData(Voting v) {
		repo.save(v);
		return "Saved";
	}

	public ResponseEntity<String> saveAllData(List<Voting> s) {
		repo.saveAll(s);
		return new ResponseEntity<>("Saved", HttpStatus.OK);
	}

	public List<Voting> getAll() {

		return repo.findAll();
	}

	public List<Voting> getBy(String name) {

		return repo.getBy(name);
	}

	public List<Voting> getsAge(int age) {
		return repo.getsAge(age);
	}

	public List<Voting> getMax(int age) {
		return repo.getMax(age);
	}

	public Optional<Voting> getNameByQuery(String name) throws NameException {
		if (repo.getNameByQuery(name).isEmpty()) {
			throw new NameException("Name not found");
		} else {
			return repo.getNameByQuery(name);
		}

	}

	public Voting getId(int id) throws InvalidAge{
		
		return  repo.findById(id).orElseThrow(()->new InvalidAge());
	}
}
