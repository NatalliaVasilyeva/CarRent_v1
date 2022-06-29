package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Accident implements Entity, Serializable {
    private int id;
    private int orderId;
    private LocalDateTime date;
    private String description;
    private double damage;


    public Accident() {
    }

    private Accident(int id, int orderId, LocalDateTime date, String description, double damage) {
        this.id = id;
        this.orderId = orderId;
        this.date = date;
        this.description = description;
        this.damage = damage;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDamage() {
        return damage;
    }

    public static final class Builder {

        private int id;
        private int orderId;
        private LocalDateTime date;
        private String description;
        private int damage;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder order(int orderId) {
            this.orderId = orderId;
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
            accident.id = this.id;
            accident.orderId = this.orderId;
            accident.date = this.date;
            accident.description = this.description;
            accident.damage = this.damage;

            return accident;
        }
    }

}