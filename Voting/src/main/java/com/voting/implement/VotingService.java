package com.voting.implement;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cinemas.customexception.IdNotFound;
import com.cinemas.entity.Movie;

@Service
public class VotingService {
	@Autowired
	VotingDao dao;

	public String setData(Voting v) throws InvalidAge {
		if (v.getAge() < 18) {
			throw new InvalidAge();
		} else {
			return dao.setData(v);
		}
	}

	public ResponseEntity<String> saveAllData(List<Voting> s) throws InvalidAge {
		List<Voting> v = s.stream().filter(l -> l.getAge() < 18).collect(Collectors.toList());
		if (v.isEmpty()) {
			return dao.saveAllData(s);
		} else {
			throw new InvalidAge();
		}
	}

	public List<Voting> getAll() {

		return dao.getAll();
	}

	public List<Voting> getByGender(String gender) {
		List<Voting> lis = dao.getAll();
		List<Voting> res = lis.stream().filter(j -> j.getGender().equalsIgnoreCase("Female"))
				.collect(Collectors.toList());
		return res;
	}

	public Voting getMinAge() {
		List<Voting> age = dao.getAll();
		Voting mnAge = age.stream().min(Comparator.comparingLong(Voting::getAge)).get();
		return mnAge;
	}

	public List<Voting> ageBetween() {
		List<Voting> lis = dao.getAll();
		List<Voting> res = lis.stream().filter(k -> k.getAge() == 18 && k.getAge() <= 30).collect(Collectors.toList());
		return res;
	}

	public List<Character> getLastName() {
		List<Voting> lisg = dao.getAll();
		List<Character> res = lisg.stream().map(l -> l.getName().charAt(l.getName().length() - 1))
				.collect(Collectors.toList());
		return res;
	}

	public List<Voting> getBy(String name) {

		return dao.getBy(name);
	}

	public List<Voting> getsAge(int age) {
		return dao.getsAge(age);
	}

	public List<Voting> getLastName(String name) {
		List<Voting> nu = dao.getAll();
		List<Voting> p = nu.stream().filter(l -> l.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		return p;
	}

	public Optional<Voting> getNameByQuery(String name) throws NameException {
		return dao.getNameByQuery(name);
	}

	public List<Voting> getByAge(int age) throws NameException {
		List<Voting> ageLlis = dao.getAll();
		List<Voting> lis = ageLlis.stream().filter(h -> h.getAge() == age).collect(Collectors.toList());
		if (lis.isEmpty()) {
			throw new NameException("No Such Age is Found");
		} else {
			return lis;
		}
	}

	public List<Voting> getGender(String gender) throws GenderException {
		List<Voting> genList = dao.getAll();
		List<Voting> finList = genList.stream().filter(l -> l.getGender().equals("Male")).collect(Collectors.toList());
		if (finList.isEmpty()) {
			throw new GenderException();
		} else {
			return finList;
		}
	}

	public Voting getId(int id) throws InvalidAge{
		return dao.getId(id);
	}
	
	

}
