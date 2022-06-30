package org.dmdev.natalliavasilyeva.api.dto.requestdto;

public class CarDto {

    private long id;
    private String brandName;
    private String modelName;
    private String  transmission;
    private String engineType;
    private String color;
    private String yearOfProduction;
    private String number;
    private String vin;
    private boolean isRepaired;
    private String image;

    public CarDto(long id, String brandName, String modelName, String transmission, String engineType, String color, String yearOfProduction, String number, String vin, boolean isRepaired, String image) {
        this.id = id;
        this.brandName = brandName;
        this.modelName = modelName;
        this.transmission = transmission;
        this.engineType = engineType;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.number = number;
        this.vin = vin;
        this.isRepaired = isRepaired;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getEngineType() {
        return engineType;
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