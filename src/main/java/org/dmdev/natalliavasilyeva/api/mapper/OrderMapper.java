package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.responsedto.OrderResponseDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.OrderShotResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.Order;

import java.util.List;
import java.util.stream.Collectors;


public class OrderMapper {

    public static OrderShotResponseDto toShotDto(Order order) {
        return new OrderShotResponseDto(
                order.getId(),
                order.getDate(),
                order.getOrderStatus().name()
        );
    }

    public static OrderResponseDto toDto(Order order) {
        return new OrderResponseDto(
                order.getId(),
                order.getDate(),
                order.getOrderStatus().name(),
                String.format("brand {} model {} number {}",
                        order.getCarRentalTime().getCar().getModel().getBrand().getName(),
                        order.getCarRentalTime().getCar().getModel().getName(),
                        order.getCarRentalTime().getCar().getNumber()),
                order.getCarRentalTime().getStartRentalDate(),
                order.getCarRentalTime().getEndRentalDate(),
                order.isInsuranceNeeded(),
                order.getSum()
        );
    }

    public static List<OrderResponseDto> toDtos(List<Order> orders) {
        return orders.stream().map(OrderMapper::toDto).collect(Collectors.toList());
    }

    public static List<OrderShotResponseDto> toShotDtos(List<Order> orders) {
        return orders.stream().map(OrderMapper::toShotDto).collect(Collectors.toList());
    }
}