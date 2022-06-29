package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;

public class Model implements Entity, Serializable {

    private int id;

    private String name;

    private String transmission;

    private String engineType;

    private int brandId;

    private int categoryId;

    public Model() {
    }

    public Model(int id, String name, String transmission, String engineType, int brandId, int categoryId) {
        this.id = id;
        this.name = name;
        this.transmission = transmission;
        this.engineType = engineType;
        this.brandId = brandId;
        this.categoryId = categoryId;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getBrandId() {
        return brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public static final class Builder {
        private int id;

        private String name;

        private String transmission;

        private String engineType;

        private int brandId;

        private int categoryId;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder engine(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder brand(int brandId) {
            this.brandId = brandId;
            return this;
        }

        public Builder category(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Model build() {
            Model model = new Model();
            model.id = this.id;
            model.name = this.name;
            model.transmission = this.transmission;
            model.engineType = this.engineType;
            model.brandId = this.brandId;
            model.categoryId = this.categoryId;

            return model;
        }
    }
}