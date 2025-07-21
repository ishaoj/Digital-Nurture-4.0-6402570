package com.library;

public class BookService {
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor: BookRepository injected");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter: BookRepository injected");
    }

    public void addBook() {
        bookRepository.save();
    }
}
