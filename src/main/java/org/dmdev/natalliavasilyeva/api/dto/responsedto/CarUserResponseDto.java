package org.dmdev.natalliavasilyeva.api.dto.responsedto;

public class CarUserResponseDto {

    private String brand;
    private ModelResponseDTO model;
    private String color;
    private String yearOfProduction;
    private String image;
    private int pricePerDay;



    public CarUserResponseDto(String brand, ModelResponseDTO model, String color, String yearOfProduction, String image, int pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.image = image;
        this.pricePerDay = pricePerDay;
    }
}