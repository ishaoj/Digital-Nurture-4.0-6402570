package com.isha.library.service;

import com.isha.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        bookRepository.printAllBooks();
    }
}
