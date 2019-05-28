package proxy;

import builder.UserService;

public class App {

    public static void main(String[] args) {
        UserService userService = new ProxyUserServiceImpl();

        userService.addNewUser("email", "123", "client");
    }
}
