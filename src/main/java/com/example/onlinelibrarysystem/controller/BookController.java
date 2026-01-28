package com.example.onlinelibrarysystem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/books")
    public List<String> getBooks() {
        List<String> books = Arrays.asList("Clean Code", "Java Fundamentals", "Spring Boot in Action");
        log.info("Request received for /books. Returning {} books.", books.size());
        return books;
    }
}
