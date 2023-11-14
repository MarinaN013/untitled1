package Seminar5.Task12;

import Seminar5.Task12.User;
import Seminar5.Task12.UserRepository;
import Seminar5.Task12.UserService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceIntegrationTest {
    User user;
    UserRepository userRepository;
    UserService userService;

    @BeforeEach
    void setUp() {
        user = new User("Иван Петров", "ipetrov@yandex.ru");
        userRepository = new UserRepository();
        userService = new UserService(userRepository);
    }

    @AfterEach
    void tearDown() {
        user = null;
        userRepository = null;
        userService = null;
    }

    @Test
    void getEmailByUsername_validUser() {
        userRepository.addUser(user);
        assertEquals("ipetrov@yandex.ru", userService.getEmailByUsername("Иван Петров"));
    }

    @Test
    void getEmailByUsername_invalidUser() {
        userRepository.addUser(user);
        assertNull(userService.getEmailByUsername("Семен Иванов"));
    }
}