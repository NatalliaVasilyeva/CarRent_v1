package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.responsedto.CategoryResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.Category;

public final class CategoryMapper {

    public static CategoryResponseDto toDto(Category category) {
        return new CategoryResponseDto(
                category.getName(),
                category.getPrice().getSum()
        );
    }
}