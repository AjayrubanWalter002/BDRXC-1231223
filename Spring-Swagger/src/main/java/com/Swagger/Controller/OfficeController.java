package com.Swagger.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Swagger.Entity.Office;
import com.Swagger.Handler.IdNotFoundException;
import com.Swagger.Repository.OfficeRepository;

@RestController
public class OfficeController {

	@Autowired
	OfficeRepository or;

	@PostMapping("/setEMP")
	public String setEmployee(@RequestBody List<Office> o) {
		or.saveAll(o);

		return "Saved";
	}

	@GetMapping("/showEMP")
	public List<Office> getAll() {
		return or.findAll();
	}

	@PostMapping("/setemp")
	public ResponseEntity<String> set(@RequestBody Office k) {
		or.save(k);
		return new ResponseEntity<String>("Saved SuccessFully", HttpStatus.OK);
	}

	@GetMapping("/showById/{id}")
	public Office showById(@PathVariable int id) throws IdNotFoundException {

		Optional<Office> s = or.findById(id);
		if (s.isPresent()) {
			return s.get();
		} else {
			throw new IdNotFoundException();
		}
	}
	@GetMapping("/showId/{j}")
	public Optional<Office> showsId(@PathVariable int j) throws IdNotFoundException{
		return or.findById(j);
	}
}

//	  @GetMapping("/students/{id}")
//	  public Student retrieveStudent(@PathVariable long id) {
//	    Optional<Student> student = studentRepository.findById(id);
//	    if (!student.isPresent())
//	      throw new StudentNotFoundException("id-" + id);
//	    return student.get();
