package org.dmdev.natalliavasilyeva.domain.model;

import java.util.Objects;

public class Price {

    private int id;
    private int sum;

    public Price() {
    }

    private Price(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return id == price.id && sum == price.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sum);
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }

    public static final class Builder {

        private int id;
        private int sum;

        public Builder id(int id) {
            this.id = id;
            return this;
        }


        public Builder sum(int sum) {
            this.sum = sum;
            return this;
        }

        public Price build() {
            Price category = new Price();
            category.id = this.id;
            category.sum = this.sum;

            return category;
        }
    }
}