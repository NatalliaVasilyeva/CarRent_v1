package org.dmdev.natalliavasilyeva.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Price implements Identifiable {

    private long id;
    private BigDecimal sum;

    public Price() {
    }

    private Price(long id, BigDecimal sum) {
        this.id = id;
        this.sum = sum;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getSum() {
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return id == price.id && Objects.equals(sum, price.sum);
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

        private long id;
        private BigDecimal sum;

        public Builder id(long id) {
            this.id = id;
            return this;
        }


        public Builder sum(BigDecimal sum) {
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