package com.mongo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.Entity.Book;
import com.mongo.Repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository br;

	public String setBook(Book k) {
		br.save(k);
		return "Saved";
	}

}
