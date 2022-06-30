package org.dmdev.natalliavasilyeva.api.dto.requestdto;

public class CategoryDto {

    private String name;

    private long priceId;

    public CategoryDto(String name, long priceId) {
        this.name = name;
        this.priceId = priceId;
    }

    public String getName() {
        return name;
    }

    public long getPriceId() {
        return priceId;
    }
}