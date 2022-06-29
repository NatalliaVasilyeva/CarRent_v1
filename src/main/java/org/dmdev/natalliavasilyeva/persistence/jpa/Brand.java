package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;

public class Brand implements Entity, Serializable {
    private int id;
    private String name;

    public Brand() {
    }

    private Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static final class Builder {

        private int id;
        private String name;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Brand build() {
            Brand brand = new Brand();
            brand.id = this.id;
            brand.name = this.name;

            return brand;
        }
    }

}