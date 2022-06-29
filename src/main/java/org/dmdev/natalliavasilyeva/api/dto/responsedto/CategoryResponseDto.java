package org.dmdev.natalliavasilyeva.api.dto.responsedto;

public class CategoryResponseDto {

    private String name;

    private int pricePerDay;

    public CategoryResponseDto(String name, int pricePerDay) {
        this.name = name;
        this.pricePerDay = pricePerDay;
    }
}