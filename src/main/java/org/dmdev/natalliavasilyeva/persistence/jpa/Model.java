package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;

public class Model implements Entity, Serializable {

    private long id;

    private String name;

    private String transmission;

    private String engineType;

    private long brandId;

    private long categoryId;

    public Model() {
    }

    public Model(long id, String name, String transmission, String engineType, long brandId, long categoryId) {
        this.id = id;
        this.name = name;
        this.transmission = transmission;
        this.engineType = engineType;
        this.brandId = brandId;
        this.categoryId = categoryId;
    }

    @Override
    public long getId() {
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

    public long getBrandId() {
        return brandId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public static final class Builder {
        private long id;

        private String name;

        private String transmission;

        private String engineType;

        private long brandId;

        private long categoryId;

        public Builder id(long id) {
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

        public Builder brand(long brandId) {
            this.brandId = brandId;
            return this;
        }

        public Builder category(long categoryId) {
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