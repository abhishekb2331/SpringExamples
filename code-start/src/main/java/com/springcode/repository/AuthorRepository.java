package com.springcode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcode.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
