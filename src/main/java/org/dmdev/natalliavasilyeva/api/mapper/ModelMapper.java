package org.dmdev.natalliavasilyeva.api.mapper;

import org.dmdev.natalliavasilyeva.api.dto.requestdto.ModelDto;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.ModelResponseDTO;
import org.dmdev.natalliavasilyeva.domain.model.Brand;
import org.dmdev.natalliavasilyeva.domain.model.Category;
import org.dmdev.natalliavasilyeva.domain.model.EngineType;
import org.dmdev.natalliavasilyeva.domain.model.Model;
import org.dmdev.natalliavasilyeva.domain.model.Transmission;

import java.util.List;
import java.util.stream.Collectors;

public final class ModelMapper {

    public static ModelResponseDTO toDto(Model model) {
        return new ModelResponseDTO(
                model.getName(),
                model.getTransmission().name(),
                model.getEngineType().name(),
                model.getCategory().getName()
        );
    }

    public static List<ModelResponseDTO> toDtos(List<Model> models) {
        return models.stream().map(ModelMapper::toDto).collect(Collectors.toList());
    }

    public static Model fromDto(ModelDto modelCreateDto) {
        return new Model.Builder()
                .name(modelCreateDto.getName())
                .transmission(Transmission.valueOf(modelCreateDto.getTransmission()))
                .engine(EngineType.valueOf(modelCreateDto.getEngineType()))
                .brand(new Brand.Builder().name(modelCreateDto.getBrand()).build())
                .category(modelCreateDto.getCategory() == null? null : new Category.Builder().name(modelCreateDto.getCategory()).build())
                .build();
    }
}