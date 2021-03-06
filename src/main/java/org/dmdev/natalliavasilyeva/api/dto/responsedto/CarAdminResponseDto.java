package org.dmdev.natalliavasilyeva.api.dto.responsedto;


import java.math.BigDecimal;
import java.util.List;

public class CarAdminResponseDto extends CarUserResponseDto {

    private String number;
    private String vin;
    private boolean isRepaired;
    private List<AccidentResponseDto> accidents;

    private List<OrderResponseDto> orders;

    public CarAdminResponseDto(String brand, ModelResponseDTO model, String color, String yearOfProduction, String image, BigDecimal pricePerDay, String number, String vin, boolean isRepaired, List<AccidentResponseDto> accidents, List<OrderResponseDto> orders) {

        super(brand, model, color, yearOfProduction, image, pricePerDay);
        this.number = number;
        this.vin = vin;
        this.isRepaired = isRepaired;
        this.accidents = accidents;
        this.orders = orders;
    }
}