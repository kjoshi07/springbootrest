package com.kc.springbootrest.repositories;

import com.kc.springbootrest.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 5/10/2017.
 */

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByBookTitle(String bookTitle);
}
