package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.requestdto.AccidentDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.AccidentResponseDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.OrderResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.Accident;
import org.dmdev.natalliavasilyeva.domain.model.Order;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;


public final class AccidentMapper {

    public static AccidentResponseDto toDto(Accident accident) {
        return new AccidentResponseDto(
                LocalDateTime.ofInstant(accident.getDate(), ZoneOffset.UTC),
                String.format("brand {} model {}",
                        accident.getOrder().getCarRentalTime().getCar().getModel().getName(),
                        accident.getOrder().getCarRentalTime().getCar().getModel().getBrand().getName()),
                accident.getOrder().getCarRentalTime().getCar().getNumber(),
                String.format("{} {}", accident.getOrder().getUser().getName(), accident.getOrder().getUser().getSurname()),
                accident.getDescription(),
                accident.getDamage()
        );
    }

    public static List<AccidentResponseDto> toDtos(List<Accident> accidents) {
        return accidents.stream().map(AccidentMapper::toDto).collect(Collectors.toList());
    }

    public static Accident fromDto(AccidentDto accidentDto) {
        return new Accident.Builder()
                .order(new Order.Builder().id(accidentDto.getOrderId()).build())
                .date(accidentDto.getDate().toInstant(ZoneOffset.UTC))
                .description(accidentDto.getDescription())
                .damage(BigDecimal.valueOf(accidentDto.getDamage()))
                .build();
    }
}