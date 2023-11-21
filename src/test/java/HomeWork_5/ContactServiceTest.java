package HomeWork_5;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ContactServiceTest {
    Contact contact;
    ContactService contactService;
    ContactRepository contactRepositoryMock;

    @BeforeEach
    void setUp() {
        contact = new Contact("Иван", "8913564287");
        contactRepositoryMock = mock(ContactRepository.class);
        contactService = new ContactService(contactRepositoryMock);
    }

    @AfterEach
    void tearDown() {
        contact = null;
        contactService = null;
    }

    @Test
    void getUserByUsername() {
        contactService.getUserByUsername("Петр");
        verify(contactRepositoryMock).getUserByUsername("Петр");
    }
}