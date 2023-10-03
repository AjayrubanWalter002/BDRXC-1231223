package com.voting.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingController {

//	Logger log = Logger.getLogger(VotingController.class);
//	{
//		 propertyConfigurator.configure('log4j.properties')
//	 }

	@Autowired
	VotingService service;
	@Autowired
	VotingRepository repo;

	@PostMapping("/setData")
	public String setData(@RequestBody Voting v) throws InvalidAge {
		return service.setData(v);

	}

	@PostMapping("/saveAll")
	public ResponseEntity<String> saveAllData(@RequestBody List<Voting> s) throws InvalidAge {
		return service.saveAllData(s);
	}

	@GetMapping("/getAll")
	public List<Voting> getAll() {
		return service.getAll();
	}

	@GetMapping("/getByGender/{gender}")
	public List<Voting> getByGender(@PathVariable String gender) {
		return service.getByGender(gender);
	}

	@GetMapping("/getMin")
	public Voting getMinAge() {
		return service.getMinAge();
	}

	@GetMapping("/ageBetween")
	public List<Voting> ageBetween() {
		return service.ageBetween();
	}

	@GetMapping("/getLast")
	public List<Character> getLastName() {
		return service.getLastName();
	}

	@GetMapping("/getByNamesQ/{name}")
	public List<Voting> getBy(@PathVariable String name) {
		return service.getBy(name);
	}

	@GetMapping("/getByAges/{age}")
	public List<Voting> getsAge(@PathVariable int age) {
		return service.getsAge(age);
	}

//	@GetMapping("/getMax/{age}")
//	public List<Voting> getMax(@PathVariable int age){
//	 return service.getMax(age);
//	}
	@GetMapping("/getRange/{age1}/{age2}")
	public List<Voting> getRange(@PathVariable int age1, @PathVariable int age2) {
		return repo.getRange(age1, age2);
	}

	@GetMapping("/maxAge")
	public Integer getMax() {
		return repo.getMax();
	}

	@GetMapping("/maxObj")
	public Voting getmaxObj() {
		return repo.getmaxObj();
	}

	@GetMapping("/minAge")
	public Integer getMin() {
		return repo.getMin();
	}

	@GetMapping("/getminObj")
	public List<Voting> getMinObj() {
		return repo.getMinObj();
	}
	@GetMapping("/getAllByQ")
	 public List<Voting> getAllByQ(){
		return repo.getAllByQ();
	}
	
	@GetMapping("/getNames/{name}")
	public List<Voting> getNames(@PathVariable String name){
		return service.getLastName(name);
	}
	
	@GetMapping("/getNameByQuery/{name}")
	public Optional<Voting> getNameByQuery(@PathVariable String name) throws NameException {
		return service.getNameByQuery(name);
	}
	
	@GetMapping("/nameAge/{age}")
	 public List<Voting> getName(@PathVariable int age)  throws NameException{
		return service.getByAge(age);
	}
	
	@GetMapping("/gender/{gender}")
	public List<Voting> getGender(@PathVariable String gender) throws GenderException{
		return service.getGender(gender);
	}
	@GetMapping("/byId/{id}")
	public Voting getId(@PathVariable int id) throws InvalidAge {
		return service.getId(id);
	}
}
