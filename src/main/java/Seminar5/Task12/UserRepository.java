package Seminar5.Task12;

import java.util.HashMap;
import java.util.Map;
// Класс UserRepository, представляющий репозиторий пользователей
public class UserRepository {
    private Map<String, User> userMap = new HashMap<>();

    // Метод для добавления пользователя в репозиторий
    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
    }
    // Метод для получения пользователя по имени пользователя
    public User getUserByUsername(String username) {
        return userMap.get(username);
    }
}