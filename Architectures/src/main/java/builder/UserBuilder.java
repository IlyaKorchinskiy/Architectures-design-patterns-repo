package builder;

import java.time.LocalDate;

public class UserBuilder {
    private final User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder email(String email) {
        user.setEmail(email);
        return this;
    }

    public UserBuilder password(String password) {
        user.setPassword(password);
        return this;
    }

    public UserBuilder name(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder lastname(String lastname) {
        user.setLastname(lastname);
        return this;
    }

    public UserBuilder sex(String sex) {
        user.setSex(sex);
        return this;
    }

    public UserBuilder birthday(String birthday) {
        user.setBirthday(LocalDate.parse(birthday));
        return this;
    }

    public UserBuilder role(String sex) {
        user.setSex(sex);
        return this;
    }

    public User build() {
        return this.user;
    }
}
