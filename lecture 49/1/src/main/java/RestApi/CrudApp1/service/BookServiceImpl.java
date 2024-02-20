package RestApi.CrudApp1.service;

import RestApi.CrudApp1.entity.Book;
import RestApi.CrudApp1.repo.BookRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    private BookRepository repository;
    public BookServiceImpl(BookRepository repository){
        this.repository=repository;
    }
    @Override
    public String upsertBook(Book book){

        Integer bookId=book.getBookId();
        System.out.println(book);
        Book savedBook=repository.save(book);
        System.out.println(book);

        if(bookId==null)
              return "record Inserted ";
        else  return "record Updated";
    }

    @Override
    public List<Book> getAllBooks(){

        return repository.findAll();

    }

    @Override
    public String deleteBook(Integer bookId){
        repository.deleteById((bookId));
        return "Book Deleted";
    }

}
