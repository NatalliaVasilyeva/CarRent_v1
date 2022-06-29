package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.responsedto.UserResponseDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.UserShotResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.User;


public class UserMapper {

    public static UserShotResponseDto toShotDto(User user) {
        return new UserShotResponseDto(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getSurname(),
                user.getAddress(),
                user.getPhone(),
                user.getBirthday(),
                DriverLicenseMapper.toDto(user.getDriverLicense())
        );
    }

    public static UserResponseDto toDto(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getSurname(),
                user.getAddress(),
                user.getPhone(),
                user.getBirthday(),
                DriverLicenseMapper.toDto(user.getDriverLicense()),
                OrderMapper.toDtos(user.getOrders())
        );
    }
}