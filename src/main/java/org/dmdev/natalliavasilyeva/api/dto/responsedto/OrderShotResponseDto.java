package org.dmdev.natalliavasilyeva.api.dto.responsedto;


import java.time.LocalDateTime;

public class OrderShotResponseDto {

    private int id;
    private LocalDateTime date;
    private String orderStatus;

    public OrderShotResponseDto(int id, LocalDateTime date, String orderStatus) {
        this.id = id;
        this.date = date;
        this.orderStatus = orderStatus;
    }
}