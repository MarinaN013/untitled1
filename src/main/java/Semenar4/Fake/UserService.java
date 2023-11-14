package Semenar4.Fake;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name) {
        User newUser = new User(name);
        userRepository.save(newUser);
        return newUser;
    }
}
