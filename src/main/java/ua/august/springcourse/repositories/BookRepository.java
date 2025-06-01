package ua.august.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.august.springcourse.models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleIgnoreCaseStartingWith(String prefix);
}
