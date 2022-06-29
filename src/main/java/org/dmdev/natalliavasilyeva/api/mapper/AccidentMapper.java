package org.dmdev.natalliavasilyeva.api.mapper;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.AccidentResponseDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.OrderResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.Accident;
import org.dmdev.natalliavasilyeva.domain.model.Order;

import java.util.List;
import java.util.stream.Collectors;


public final class AccidentMapper {
   
    public static AccidentResponseDto toDto(Accident accident) {
        return new AccidentResponseDto(
                accident.getDate(),
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
}