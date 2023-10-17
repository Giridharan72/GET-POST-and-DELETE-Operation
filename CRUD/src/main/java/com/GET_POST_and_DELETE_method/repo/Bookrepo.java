package com.GET_POST_and_DELETE_method.repo;

import com.GET_POST_and_DELETE_method.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepo extends JpaRepository<Book, Long> {

}