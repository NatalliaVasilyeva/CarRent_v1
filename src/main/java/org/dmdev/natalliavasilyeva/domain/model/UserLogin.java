package org.dmdev.natalliavasilyeva.domain.model;

import java.util.Objects;

public class UserLogin implements Identifiable {

    private String email;
    private String password;

    public UserLogin() {

    }

    private UserLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLogin loginUser = (UserLogin) o;
        return Objects.equals(email, loginUser.email) && Objects.equals(password, loginUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static final class Builder {
        private String email;
        private String password;

        public Builder() {

        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.email = email;
            return this;
        }

        public UserLogin build() {
            UserLogin user = new UserLogin();
            user.email = this.email;
            user.password = password;
            return user;
        }
    }
}