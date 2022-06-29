package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.time.LocalDate;

public class UserDetails implements Entity, Serializable {

    private int id;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private LocalDate birthday;
    private int userId;
    private int driverLicenseId;

    public UserDetails() {
    }

    private UserDetails(int id, String name, String surname, String address, String phone, LocalDate birthday, int userId, int driverLicenseId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.userId = userId;
        this.driverLicenseId = driverLicenseId;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getUser() {
        return userId;
    }

    public void setUser(int user) {
        this.userId = userId;
    }

    public int getDriverLicense() {
        return driverLicenseId;
    }

    public void setDriverLicense(int driverLicense) {
        this.driverLicenseId = driverLicenseId;
    }

    public static final class Builder {
        private int id;
        private String name;
        private String surname;
        private String address;
        private String phone;
        private LocalDate birthday;
        private int userId;
        private int driverLicenseId;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder user(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder driverLicense(int driverLicenseId) {
            this.driverLicenseId = driverLicenseId;
            return this;
        }

        public UserDetails build() {
            UserDetails userDetails = new UserDetails();
            userDetails.id = this.id;
            userDetails.name = this.name;
            userDetails.surname = this.surname;
            userDetails.address = this.address;
            userDetails.phone = this.phone;
            userDetails.birthday = this.birthday;
            userDetails.userId = this.userId;
            userDetails.driverLicenseId = this.driverLicenseId;

            return userDetails;
        }

    }
}