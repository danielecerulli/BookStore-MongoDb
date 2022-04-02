package it.danielecerulli.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.danielecerulli.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
