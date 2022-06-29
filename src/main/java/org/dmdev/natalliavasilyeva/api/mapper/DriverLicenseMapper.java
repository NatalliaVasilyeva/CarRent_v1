package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.responsedto.DriverLicenseDto;
import org.dmdev.natalliavasilyeva.domain.model.DriverLicense;


public class DriverLicenseMapper {

    public static DriverLicenseDto toDto(DriverLicense driverLicense) {
        return new DriverLicenseDto(
                driverLicense.getNumber(),
                driverLicense.getIssueDate(),
                driverLicense.getExpiredDate()
        );
    }
}