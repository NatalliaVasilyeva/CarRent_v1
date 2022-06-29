package org.dmdev.natalliavasilyeva.api.dto.responsedto;


import java.time.LocalDateTime;

public class AccidentResponseDto {

    private LocalDateTime date;
    private String carDescription;
    private String carNumber;
    private String userName;
    private String description;
    private double damage;

    public AccidentResponseDto(LocalDateTime date, String carDescription, String carNumber, String userName, String description, double damage) {
        this.date = date;
        this.carDescription = carDescription;
        this.carNumber = carNumber;
        this.userName = userName;
        this.description = description;
        this.damage = damage;
    }
}