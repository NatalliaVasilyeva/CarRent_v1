package org.dmdev.natalliavasilyeva.api.dto.requestdto;

import java.time.LocalDateTime;

public class AccidentDto {

    private LocalDateTime date;
    private String description;
    private double damage;

    public AccidentDto(LocalDateTime date, String description, double damage) {
        this.date = date;
        this.description = description;
        this.damage = damage;
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