package org.dmdev.natalliavasilyeva.persistence.jpa;

public class Category implements Entity {

    private int id;
    private String name;
    private int priceId;

    public Category() {
    }

    private Category(int id, String name, int priceId) {
        this.id = id;
        this.name = name;
        this.priceId = priceId;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriceId() {
        return priceId;
    }

    public static final class Builder {

        private int id;
        private String name;

        private int priceId;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(int priceId) {
            this.priceId = priceId;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.id = this.id;
            category.name = this.name;
            category.priceId = this.priceId;

            return category;
        }
    }
}