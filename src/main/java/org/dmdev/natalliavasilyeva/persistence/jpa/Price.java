package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;

public class Price implements Entity, Serializable {

    private int id;
    private int sum;

    public Price() {
    }

    private Price(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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
            Price price = new Price();
            price.id = this.id;
            price.sum = this.sum;

            return price;
        }
    }

}