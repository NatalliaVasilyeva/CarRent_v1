package org.dmdev.natalliavasilyeva.api.dto.requestdto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserRegistrationDto {
    private String email;
    private String password;
    private String role;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private LocalDate birthday;
    private int driverLicenseNumber;
    private LocalDateTime driverLicenseIssueDate;
    private LocalDateTime driverLicenseExpiredDate;

    public UserRegistrationDto(String email, String password, String role, String name, String surname, String address, String phone, LocalDate birthday, int driverLicenseNumber, LocalDateTime driverLicenseIssueDate, LocalDateTime driverLicenseExpiredDate) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.driverLicenseNumber = driverLicenseNumber;
        this.driverLicenseIssueDate = driverLicenseIssueDate;
        this.driverLicenseExpiredDate = driverLicenseExpiredDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public LocalDateTime getDriverLicenseIssueDate() {
        return driverLicenseIssueDate;
    }

    public LocalDateTime getDriverLicenseExpiredDate() {
        return driverLicenseExpiredDate;
    }
}