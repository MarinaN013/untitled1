package HomeWork_3_3;

public class User {

    String name;
    String password;


    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAuthenticate = true;


    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }
}
