package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.responsedto.DriverLicenseDto;
import org.dmdev.natalliavasilyeva.domain.model.DriverLicense;

import java.time.LocalDateTime;
import java.time.ZoneOffset;


public class DriverLicenseMapper {

    public static DriverLicenseDto toDto(DriverLicense driverLicense) {
        return new DriverLicenseDto(
                driverLicense.getNumber(),
                LocalDateTime.ofInstant(driverLicense.getIssueDate(), ZoneOffset.UTC),
                LocalDateTime.ofInstant(driverLicense.getExpiredDate(), ZoneOffset.UTC)
        );
    }
}