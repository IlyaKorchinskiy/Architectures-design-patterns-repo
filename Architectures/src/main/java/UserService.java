public class UserService {

    public void addNewUser(String email, String password, String role) {
        User user = new UserBuilder()
                .email(email)
                .password(password)
                .role(role)
                .build();

    }
}