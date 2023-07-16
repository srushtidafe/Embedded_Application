package com.geekster.EmbeddedApplication.Controller;

import com.geekster.EmbeddedApplication.Model.Book;
import com.geekster.EmbeddedApplication.Model.Student;
import com.geekster.EmbeddedApplication.Service.BookService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("Book")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }
    @GetMapping("Book/bookId/{bookId}")
    public Optional<Book> getBookById(@PathVariable Long bookId){
        return bookService.getBookById(bookId);
    }

    @PostMapping("Book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("Book/bookId/{bookId}")
    public String removeBookById(@PathVariable Long bookId){
        return bookService.removeBookById(bookId);
    }
}
