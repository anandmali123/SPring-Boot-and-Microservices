package RestApi.CrudApp1.repo;

import RestApi.CrudApp1.entity.Book;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository  extends JpaRepository <Book, Serializable> {
}
