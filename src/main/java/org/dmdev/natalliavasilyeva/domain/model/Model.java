package org.dmdev.natalliavasilyeva.domain.model;


import java.util.Collections;
import java.util.Objects;

public class Model {

    private String name;
    private Transmission transmission;
    private EngineType engineType;
    private Brand brand;
    private Category category;

    public Model() {
    }

    public Model(String name, Transmission transmission, EngineType engineType, Brand brand, Category category) {
        this.name = name;
        this.transmission = transmission;
        this.engineType = engineType;
        this.brand = brand;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Brand getBrand() {
        return brand;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(name, model.name) && transmission == model.transmission && engineType == model.engineType && Objects.equals(brand, model.brand) && category == model.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transmission, engineType, brand, category);
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", transmission=" + transmission +
                ", engineType=" + engineType +
                ", brand=" + brand +
                ", category=" + category +
                '}';
    }

    public static final class Builder {

        private String name;

        private Transmission transmission;

        private EngineType engineType;

        private Brand brand;

        private Category category;

        public Builder() {
            this.brand = new Brand.Builder().models(Collections.emptyList()).build();
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder engine(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder brand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Model build() {
            Model model = new Model();
            model.name = this.name;
            model.transmission = this.transmission;
            model.engineType = this.engineType;
            model.brand = this.brand;
            model.category = this.category;

            return model;
        }
    }
}