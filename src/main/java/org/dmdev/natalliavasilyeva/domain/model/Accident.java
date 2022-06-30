package org.dmdev.natalliavasilyeva.domain.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Accident implements ModelMarkInterface {

    private long id;
    private Order order;
    private Instant date;
    private String description;
    private BigDecimal damage;

    public Accident() {
    }

    private Accident(long id, Order order, Instant date, String description, BigDecimal damage) {
        this.id = id;
        this.order = order;
        this.date = date;
        this.description = description;
        this.damage = damage;
    }

    public long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public Instant getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getDamage() {
        return damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accident accident = (Accident) o;
        return id == accident.id && Objects.equals(order, accident.order) && Objects.equals(date, accident.date) && Objects.equals(description, accident.description) && Objects.equals(damage, accident.damage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order, date, description, damage);
    }

    @Override
    public String toString() {
        return "Accident{" +
                "id=" + id +
                ", order=" + order +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", damage=" + damage +
                '}';
    }

    public static final class Builder {

        private long id;
        private Order order;
        private Instant date;
        private String description;
        private BigDecimal damage;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder date(Instant date) {
            this.date = date;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder damage(BigDecimal damage) {
            this.damage = damage;
            return this;
        }

        public Accident build() {
            Accident accident = new Accident();
            accident.id = id;
            accident.order = this.order;
            accident.date = this.date;
            accident.description = this.description;
            accident.damage = this.damage;

            return accident;
        }
    }

}