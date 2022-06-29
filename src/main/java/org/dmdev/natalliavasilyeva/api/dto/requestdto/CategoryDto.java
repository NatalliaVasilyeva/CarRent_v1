package org.dmdev.natalliavasilyeva.api.dto.requestdto;

public class CategoryDto {

    private String name;

    private int priceId;

    public CategoryDto(String name, int priceId) {
        this.name = name;
        this.priceId = priceId;
    }

    public String getName() {
        return name;
    }

    public int getPriceId() {
        return priceId;
    }
}