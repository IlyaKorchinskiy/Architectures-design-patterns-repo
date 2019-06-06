package ru.korchinskiy.proxy;

import ru.korchinskiy.builder.UserService;

public class App {

    public static void main(String[] args) {
        UserService userService = new ProxyUserServiceImpl();

        userService.addNewUser("email", "123", "client");
    }
}
