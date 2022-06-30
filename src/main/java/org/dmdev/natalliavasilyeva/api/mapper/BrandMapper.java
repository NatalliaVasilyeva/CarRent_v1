package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.requestdto.BrandDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.BrandResponseDTO;
import org.dmdev.natalliavasilyeva.domain.model.Brand;

import java.util.List;
import java.util.stream.Collectors;

public final class BrandMapper {

    public static BrandResponseDTO toDto(Brand brand) {
        return new BrandResponseDTO(
                brand.getName(),
                ModelMapper.toDtos(brand.getModels())
        );
    }

    public static List<BrandResponseDTO> toDtos(List<Brand> brands) {
        return brands.stream().map(BrandMapper::toDto).collect(Collectors.toList());
    }

    public static Brand fromDto(BrandDto brandDto) {
        return new Brand.Builder()
                .name(brandDto.getName())
                .build();
    }
}