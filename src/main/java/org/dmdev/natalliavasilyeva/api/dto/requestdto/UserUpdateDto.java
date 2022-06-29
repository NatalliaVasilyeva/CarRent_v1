package org.dmdev.natalliavasilyeva.api.dto.requestdto;

import java.time.LocalDateTime;

public class UserUpdateDto {

    private String email;
    private String password;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private int licenseNumber;
    private LocalDateTime issueDate;
    private LocalDateTime expiredDate;

    public UserUpdateDto(String email, String password, String name, String surname, String address, String phone, int licenseNumber, LocalDateTime issueDate, LocalDateTime expiredDate) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.issueDate = issueDate;
        this.expiredDate = expiredDate;
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

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public LocalDateTime getExpiredDate() {
        return expiredDate;
    }
}