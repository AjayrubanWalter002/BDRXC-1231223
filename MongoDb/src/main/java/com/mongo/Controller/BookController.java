package com.mongo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mongo.Entity.Book;
import com.mongo.Repository.BookRepository;
import com.mongo.Service.BookService;
import jakarta.annotation.Resource;

@RestController
public class BookController {
	@Autowired
	BookService bs;

	@Resource
	BookRepository br;

	@PostMapping("/setBooks")
	public String setBook(@RequestBody Book b) {
		return bs.setBook(b);
	}

	@PostMapping("/setAllBooks")
	public String setAllBook(@RequestBody List<Book> g) {
		br.saveAll(g);
		return "Saved All";
	}

	@GetMapping("findById/{id}")
	public Optional<Book> findById(@PathVariable int id) {
		return br.findById(id);
	}

	@GetMapping("/getAll")
	public List<Book> getAll() {
		return br.findAll();
	}
}
