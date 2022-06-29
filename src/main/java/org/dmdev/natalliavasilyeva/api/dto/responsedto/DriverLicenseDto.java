package org.dmdev.natalliavasilyeva.api.dto.responsedto;

import java.time.LocalDateTime;

public class DriverLicenseDto {

    private int driverLicenseNumber;
    private LocalDateTime driverLicenseIssueDate;
    private LocalDateTime driverLicenseExpiredDate;

    public DriverLicenseDto(int driverLicenseNumber, LocalDateTime driverLicenseIssueDate, LocalDateTime driverLicenseExpiredDate) {
        this.driverLicenseNumber = driverLicenseNumber;
        this.driverLicenseIssueDate = driverLicenseIssueDate;
        this.driverLicenseExpiredDate = driverLicenseExpiredDate;
    }
}