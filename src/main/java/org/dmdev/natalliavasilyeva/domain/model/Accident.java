package org.dmdev.natalliavasilyeva.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Accident {

    private int id;
    private Order order;
    private LocalDateTime date;
    private String description;
    private double damage;

    public Accident() {
    }

    private Accident(int id, Order order, LocalDateTime date, String description, double damage) {
        this.id = id;
        this.order = order;
        this.date = date;
        this.description = description;
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accident accident = (Accident) o;
        return id == accident.id && Double.compare(accident.damage, damage) == 0 && Objects.equals(order, accident.order) && Objects.equals(date, accident.date) && Objects.equals(description, accident.description);
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

        private int id;
        private Order order;
        private LocalDateTime date;
        private String description;
        private int damage;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Builder year(String description) {
            this.description = description;
            return this;
        }

        public Builder damage(int damage) {
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