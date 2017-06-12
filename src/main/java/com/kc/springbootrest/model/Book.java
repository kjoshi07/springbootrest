package com.kc.springbootrest.model;

import org.omg.PortableServer.THREAD_POLICY_ID;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Khemchand Joshi on 5/8/2017.
 */

@Entity
@Table(name = "books")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    @Column
    private String bookTitle;

    @Column
    private String bookAuthor;

    public Book(Long _bookId, String _bookTitle, String _bookAuthor) {
        this.bookId = _bookId;
        this.bookTitle = _bookTitle;
        this.bookAuthor = _bookAuthor;
    }

    public Book() {

    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
