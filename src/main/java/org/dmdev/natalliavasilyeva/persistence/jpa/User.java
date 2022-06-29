package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;

public class User implements Entity, Serializable {
    private int id;
    private String email;
    private String password;
    private String role;

    public User() {
    }

    private User(int id, String email, String password, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static final class Builder {

        private final String DEFAULT_USER_ROLE = "CLIENT";
        private int id;
        private String email;
        private String password;
        private String role;

        public Builder() {
            this.role = DEFAULT_USER_ROLE;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = email;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            User user = new User();
            user.id = this.id;
            user.email = this.email;
            user.password = this.password;
            user.role = this.role;

            return user;
        }
    }

}