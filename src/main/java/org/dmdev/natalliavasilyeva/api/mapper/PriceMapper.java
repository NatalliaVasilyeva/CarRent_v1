package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.requestdto.PriceDto;
import org.dmdev.natalliavasilyeva.domain.model.Price;


public class PriceMapper {

    public static Price fromDto(PriceDto priceDto) {
        return new Price.Builder()
                .sum(priceDto.getSum())
                .build();
    }
}