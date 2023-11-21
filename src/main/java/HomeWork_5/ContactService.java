package HomeWork_5;

// Класс ContactService, предоставляющий сервис для работы с пользователями
public class ContactService {
    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;}

    // Метод для получения email пользователя по его имени пользователя

    public String getUserByUsername(String contactName) {
        Contact contact = contactRepository.getUserByUsername(contactName);

        if (contact != null) {
            return contact.getPhone();
        } else {
            return null;
        }
    }


}




