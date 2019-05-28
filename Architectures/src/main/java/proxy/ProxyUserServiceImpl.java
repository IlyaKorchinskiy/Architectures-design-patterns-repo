package proxy;

import builder.UserService;
import builder.UserServiceImpl;

public class ProxyUserServiceImpl implements UserService {
    private UserService userService = new UserServiceImpl();

    @Override
    public void addNewUser(String email, String password, String role) {
        System.out.println("Add new user: " + email + " " + password + " " + role);
        userService.addNewUser(email, password, role);
        System.out.println("User " + email + " successfully added");
    }
}
