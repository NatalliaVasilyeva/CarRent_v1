package org.dmdev.natalliavasilyeva.api.dto.responsedto;

import java.math.BigDecimal;

public class CarUserResponseDto {

    private String brand;
    private ModelResponseDTO model;
    private String color;
    private String yearOfProduction;
    private String image;
    private BigDecimal pricePerDay;


    public CarUserResponseDto(String brand, ModelResponseDTO model, String color, String yearOfProduction, String image, BigDecimal pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.image = image;
        this.pricePerDay = pricePerDay;
    }
}