package Bank;

import java.util.ArrayList;
import java.util.List;

public class BankSingleton {
    private static BankSingleton instance;
    private List<User> users = new ArrayList<>();


    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    private BankSingleton() {
    }

    public User createUser(String username, String password) {
for (User user : users){
    if (user.getUsername().equals(username)){

        throw new IllegalArgumentException("User exist");
    }
}
        User newuser = new User(username, password);
        users.add(newuser);


        return newuser;
    }

public User authenticate(String username, String password){
        for ( User user : users){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("successful authentication");
                return user;
            }
        }
    System.out.println("fail to authenticate");
        return null;
}


}
