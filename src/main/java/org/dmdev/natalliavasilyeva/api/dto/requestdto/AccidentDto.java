package org.dmdev.natalliavasilyeva.api.dto.requestdto;

import java.time.LocalDateTime;

public class AccidentDto {

    private long orderId;
    private LocalDateTime date;
    private String description;
    private double damage;

    public AccidentDto(long orderId, LocalDateTime date, String description, double damage) {
        this.orderId = orderId;
        this.date = date;
        this.description = description;
        this.damage = damage;
    }

    public long getOrderId() {
        return orderId;
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
}