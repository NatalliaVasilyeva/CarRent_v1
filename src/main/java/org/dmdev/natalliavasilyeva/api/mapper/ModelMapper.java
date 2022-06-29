package org.dmdev.natalliavasilyeva.api.mapper;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.BrandResponseDTO;
import org.dmdev.natalliavasilyeva.api.dto.responsedto.ModelResponseDTO;
import org.dmdev.natalliavasilyeva.domain.model.Brand;
import org.dmdev.natalliavasilyeva.domain.model.Model;

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
}