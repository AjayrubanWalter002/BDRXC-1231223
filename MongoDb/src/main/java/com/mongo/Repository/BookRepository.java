package com.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.Entity.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
