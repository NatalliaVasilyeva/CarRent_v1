package org.dmdev.natalliavasilyeva.domain.model;


import java.util.List;
import java.util.Objects;

public class Brand implements ModelMarkInterface {
    private String name;
    private List<Model> models;

    public Brand() {
    }



    public String getName() {
        return name;
    }

    public List<Model> getModels() {
        return models;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return Objects.equals(name, brand.name) && Objects.equals(models, brand.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, models);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }

    public static final class Builder {

        private String name;

        private List<Model> models;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder models(List<Model> models) {
            this.models = models;
            return this;
        }

        public Brand build() {
            Brand brand = new Brand();
            brand.name = this.name;
            brand.models = models;

            return brand;
        }
    }

}