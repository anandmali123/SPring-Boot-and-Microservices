package RestApi.CrudApp1.service;

import RestApi.CrudApp1.entity.Book;

import java.util.List;

public interface BookService {

    public String upsertBook(Book book);

    public List<Book> getAllBooks();


    public String deleteBook(Integer bookId);
}
