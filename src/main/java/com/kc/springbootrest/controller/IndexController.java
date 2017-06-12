package com.kc.springbootrest.controller;

import com.kc.springbootrest.model.Book;
import com.kc.springbootrest.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by User on 5/8/2017.
 */

@RestController
@RequestMapping("/api/v1")
public class IndexController {
    public static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    //--------------------------------Retrieve All Users -----------------------

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello() {

        return "Hello World!";
    }
}
