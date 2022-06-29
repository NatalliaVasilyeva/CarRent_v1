package org.dmdev.natalliavasilyeva.api.dto.requestdto;

public class PriceDto {

    private int sum;

    public PriceDto(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}