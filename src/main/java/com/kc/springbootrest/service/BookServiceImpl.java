package com.kc.springbootrest.service;

import com.kc.springbootrest.model.Book;
import com.kc.springbootrest.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by User on 5/8/2017.
 */

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findById(long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void saveBook(Book book) {

        bookRepository.save(book);

    }

    @Override
    public void updateBook(Book book) {

        saveBook(book);

    }

    @Override
    public void deleteBookById(long id) {

    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteAllBooks() {
        bookRepository.deleteAll();

    }

    @Override
    public boolean isBookExist(Book book) {
        boolean isExist = false;
        if(findByBookTitle(book.getBookTitle()) != null) {
            isExist = true;
        }

        return isExist;
    }

    @Override
    public Book findByBookTitle(String bookTitle) {
        return bookRepository.findByBookTitle(bookTitle);
    }

}
