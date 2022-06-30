package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.requestdto.CategoryDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.CategoryResponseDto;
import org.dmdev.natalliavasilyeva.domain.model.Category;
import org.dmdev.natalliavasilyeva.domain.model.Price;

import java.util.List;
import java.util.stream.Collectors;

public final class CategoryMapper {

    public static CategoryResponseDto toDto(Category category) {
        return new CategoryResponseDto(
                category.getName(),
                category.getPrice().getSum()
        );
    }

    public static List<CategoryResponseDto> toDtos(List<Category> categories) {
        return categories.stream().map(CategoryMapper::toDto).collect(Collectors.toList());
    }

    public static Category fromDto(CategoryDto categoryDto) {
        return new Category.Builder()
                .name(categoryDto.getName())
                .price(new Price.Builder().id(categoryDto.getPriceId()).build())
                .build();
    }
}