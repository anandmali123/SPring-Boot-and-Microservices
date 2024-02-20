package RestApi.CrudApp1.controller;

import RestApi.CrudApp1.entity.Book;
import RestApi.CrudApp1.service.BookService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;
  @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String msg= service.upsertBook(book);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> allBooks=service.getAllBooks();
        return new ResponseEntity<>(allBooks,HttpStatus.OK);
    }

    @PutMapping("/book")
    public ResponseEntity<String> updateBook(@RequestBody Book book){
      String msg=service.upsertBook(book);
      return new ResponseEntity<>(msg,HttpStatus.OK);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
      String msg=service.deleteBook(bookId);
      return new ResponseEntity<>(msg,HttpStatus.OK);
  }

}
