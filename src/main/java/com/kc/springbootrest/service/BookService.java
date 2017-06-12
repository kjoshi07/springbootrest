package com.kc.springbootrest.service;

import com.kc.springbootrest.model.Book;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Created by User on 5/8/2017.
 */
public interface BookService {

    Book findById(long id);

    void saveBook(Book book);

    void updateBook(Book book);

    void deleteBookById(long id);

    List<Book> findAllBooks();

    void deleteAllBooks();

    boolean isBookExist(Book book);

   Book findByBookTitle(String bookTitle);
}
