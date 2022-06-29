package org.dmdev.natalliavasilyeva.api.dto.responsedto;

public class ModelResponseDTO {

    private String name;
    private String transmission;
    private String engineType;
    private String category;

    public ModelResponseDTO(String name, String transmission, String engineType, String category) {
        this.name = name;
        this.transmission = transmission;
        this.engineType = engineType;
        this.category = category;
    }
}