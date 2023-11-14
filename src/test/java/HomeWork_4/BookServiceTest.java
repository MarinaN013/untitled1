package HomeWork_4;

import Semenar4.Mock.DeliveryService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

class BookServiceTest {
    private BookService bookService;
    BookRepository bookRepositoryMock;

    @BeforeEach
    @DisplayName("Создание Mock объект для BookRepository ")
    void setUp() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        bookService =new BookService(bookRepositoryMock);
    }

    @AfterEach
    void tearDown() {
        bookService = null;
        bookRepositoryMock = null;
    }

    @Test
    void findBookById() {
        String id ="1";
        bookService.findBookById(id);
        verify(bookRepositoryMock).findById(id);
    }

    @Test
    void findAllBooks() {
        bookService.findAllBooks();
        verify(bookRepositoryMock).findAll();
    }
}

