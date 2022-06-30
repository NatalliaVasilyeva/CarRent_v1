package org.dmdev.natalliavasilyeva.api.dto.requestdto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDto {
    private String email;
    private String password;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private LocalDate birthday;
    private String driverLicenseNumber;
    private LocalDateTime driverLicenseIssueDate;
    private LocalDateTime driverLicenseExpiredDate;

    public UserDto(String email, String password, String name, String surname, String address, String phone, LocalDate birthday, String driverLicenseNumber, LocalDateTime driverLicenseIssueDate, LocalDateTime driverLicenseExpiredDate) {
        this.email = email;
        this.password = password;
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

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public LocalDateTime getDriverLicenseIssueDate() {
        return driverLicenseIssueDate;
    }

    public LocalDateTime getDriverLicenseExpiredDate() {
        return driverLicenseExpiredDate;
    }
}