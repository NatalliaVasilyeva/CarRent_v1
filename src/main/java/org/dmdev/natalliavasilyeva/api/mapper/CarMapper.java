package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.requestdto.CarDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.CarAdminResponseDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.CarUserResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.Brand;
import org.dmdev.natalliavasilyeva.domain.model.Car;
import org.dmdev.natalliavasilyeva.domain.model.Category;
import org.dmdev.natalliavasilyeva.domain.model.Color;
import org.dmdev.natalliavasilyeva.domain.model.EngineType;
import org.dmdev.natalliavasilyeva.domain.model.Model;
import org.dmdev.natalliavasilyeva.domain.model.Transmission;

import java.util.List;
import java.util.stream.Collectors;


public class CarMapper {

    public static CarUserResponseDto toShotDto(Car car) {
        return new CarUserResponseDto(

                car.getModel().getBrand().getName(),
                ModelMapper.toDto(car.getModel()),
                car.getColor().name(),
                car.getYearOfProduction(),
                car.getImage(),
                car.getModel().getCategory().getPrice().getSum()
        );
    }

    public static CarAdminResponseDto toDto(Car car) {
        return new CarAdminResponseDto(
                car.getModel().getBrand().getName(),
                ModelMapper.toDto(car.getModel()),
                car.getColor().name(),
                car.getYearOfProduction(),
                car.getImage(),
                car.getModel().getCategory().getPrice().getSum(),
                car.getNumber(),
                car.getVin(),
                car.isRepaired(),
                AccidentMapper.toDtos(car.getAccidents()),
                OrderMapper.toDtos(car.getOrders())
        );
    }

    public static List<CarUserResponseDto> toShotDtos(List<Car> cars) {
        return cars.stream().map(CarMapper::toShotDto).collect(Collectors.toList());
    }

    public static List<CarAdminResponseDto> toDtos(List<Car> cars) {
        return cars.stream().map(CarMapper::toDto).collect(Collectors.toList());
    }


    public static Car fromDto(CarDto carCreateDto) {
        return new Car.Builder()
                .id(carCreateDto.getId())
                .model(new Model.Builder()
                        .name(carCreateDto.getModelName())
                        .transmission(Transmission.valueOf(carCreateDto.getTransmission()))
                        .engine(EngineType.valueOf(carCreateDto.getEngineType()))
                        .brand(new Brand.Builder().name(carCreateDto.getBrandName()).build())
                        .category(new Category.Builder().build())
                        .build())
                .color(Color.valueOf(carCreateDto.getColor()))
                .year(carCreateDto.getYearOfProduction())
                .number(carCreateDto.getNumber())
                .vin(carCreateDto.getVin())
                .repaired(carCreateDto.isRepaired())
                .image(carCreateDto.getImage())
                .build();
    }
}