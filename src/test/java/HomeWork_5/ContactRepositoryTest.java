package HomeWork_5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ContactRepositoryTest {
    Contact contact;
    ContactRepository contactRepositoryMock;
    ContactRepository contactRepository;

    @BeforeEach
    void setUp() {
        contact = new Contact("Иван", "8913526478");
        contactRepositoryMock = mock(ContactRepository.class);
        contactRepository = new ContactRepository();
    }

    @AfterEach
    void tearDown() {
        contact = null;
        contactRepository = null;
    }

    @Test
    void addContact() {
        contactRepositoryMock.addContact(contact);
        verify(contactRepositoryMock).addContact(contact);
    }

    @Test
    void getUserByUsername() {
        contactRepository.addContact(contact);
        assertEquals(contact, contactRepository.getUserByUsername("Иван"));

    }
}
