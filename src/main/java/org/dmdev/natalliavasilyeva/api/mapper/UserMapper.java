package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.responsedto.UserResponseDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.UserShotResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.User;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;


public class UserMapper {

    public static UserShotResponseDto toShotDto(User user) {
        return new UserShotResponseDto(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getSurname(),
                user.getAddress(),
                user.getPhone(),
                LocalDate.ofInstant(user.getBirthday(), ZoneOffset.UTC),
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
                LocalDate.ofInstant(user.getBirthday(), ZoneOffset.UTC),
                DriverLicenseMapper.toDto(user.getDriverLicense()),
                OrderMapper.toDtos(user.getOrders())
        );
    }

    public static List<UserResponseDto> toDtos(List<User> users) {
        return users.stream().map(UserMapper::toDto).collect(Collectors.toList());
    }

    public static List<UserShotResponseDto> toShotDtos(List<User> users) {
        return users.stream().map(UserMapper::toShotDto).collect(Collectors.toList());
    }
}