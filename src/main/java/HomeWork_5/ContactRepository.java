package HomeWork_5;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ContactRepository{
private Map<String, Contact> contactMap=new HashMap<>();

// Метод для добавления пользователя в репозиторий
public void addContact(Contact contact){
        contactMap.put(contact.getContactName(),contact);
        }
// Метод для получения пользователя по имени пользователя
public Contact getUserByUsername(String contactName){
        return contactMap.get(contactName);
        }
        }




