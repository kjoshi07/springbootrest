package com.kc.springbootrest.controller;

import com.kc.springbootrest.model.Book;
import com.kc.springbootrest.model.ErrorResponse;
import com.kc.springbootrest.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by User on 5/8/2017.
 */

@RestController
@RequestMapping("/api/v1")
public class BookController {
    public static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    /**
     * GET /create  --> Create a new booking and save it in the database.
     */
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public ResponseEntity<?> createBook(@RequestBody Book book) {
        logger.info("Creating user: ", book);
        if (bookService.isBookExist(book)) {
            ErrorResponse response = new ErrorResponse();
            response.setStatus("FAILED");
            response.setErrorMessage(book.getBookTitle() + " is already exist.");
            return new ResponseEntity<ErrorResponse>(response, HttpStatus.CONFLICT);
        }
        bookService.saveBook(book);
        return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }

    //--------------------------------Retrieve All Users -----------------------

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.findAllBooks();
        logger.debug("Books api called");
        if (books.isEmpty()) {
            return new ResponseEntity<List<Book>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
    }
}
