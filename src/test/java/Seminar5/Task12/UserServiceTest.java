package Seminar5.Task12;

import Seminar5.Task12.User;
import Seminar5.Task12.UserRepository;
import Seminar5.Task12.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class UserServiceTest {
    User user;
    UserRepository userRepositoryMock;
    UserService userService;

    @BeforeEach
    void setUp() {
        user = new User("Иван Петров", "ipetrov@yandex.ru");
        userRepositoryMock = mock(UserRepository.class);
        userService = new UserService(userRepositoryMock);
    }

    @AfterEach
    void tearDown() {
        user = null;
        userService = null;
    }

    @Test
    void getEmailByUsername() {
        userService.getEmailByUsername("Иван Петров");
        verify(userRepositoryMock).getUserByUsername("Иван Петров");
    }
}