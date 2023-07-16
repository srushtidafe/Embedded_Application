package com.geekster.EmbeddedApplication.Service;

import com.geekster.EmbeddedApplication.Model.Book;
import com.geekster.EmbeddedApplication.Repository.IBookRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public List<Book> getAllBook() {
        return  bookRepo.findAll();
    }

    public Optional<Book> getBookById(Long bookId) {
        return bookRepo.findById(bookId);
    }

    public String addBook(Book book) {
        bookRepo.save(book);
        return"Added";
    }


    public String removeBookById(Long bookId) {
        bookRepo.deleteById(bookId);
        return " Deleted";
    }
}

