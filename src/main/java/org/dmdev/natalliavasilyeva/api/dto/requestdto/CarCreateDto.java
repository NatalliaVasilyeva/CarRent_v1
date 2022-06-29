package org.dmdev.natalliavasilyeva.api.dto.requestdto;

public class CarCreateDto {

    private String brandName;
    private String modelName;
    private String color;
    private String yearOfProduction;
    private String number;
    private String vin;
    private boolean isRepaired;
    private String image;

    public CarCreateDto(String brandName, String modelName, String color, String yearOfProduction, String number, String vin, boolean isRepaired, String image) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.number = number;
        this.vin = vin;
        this.isRepaired = isRepaired;
        this.image = image;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public String getNumber() {
        return number;
    }

    public String getVin() {
        return vin;
    }

    public boolean isRepaired() {
        return isRepaired;
    }

    public String getImage() {
        return image;
    }
}