package bookStore.service;

import bookStore.dto.BookDto;
import bookStore.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAll();

    List<Book> findByNameOrAuthorOrGenre(String name, String author, String genre);

    boolean delete(int id);

    boolean update(BookDto bookDto);

    boolean create(BookDto bookDto);

    Book sell(String name, String author, String genre, int quantity);
}
