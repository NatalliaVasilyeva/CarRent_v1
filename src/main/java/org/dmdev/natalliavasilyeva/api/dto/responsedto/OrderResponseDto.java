package org.dmdev.natalliavasilyeva.api.dto.responsedto;

import java.time.LocalDateTime;

public class OrderResponseDto extends OrderShotResponseDto {

    private String carDescription;
    private LocalDateTime startRentalDate;
    private LocalDateTime endRentalDate;
    private boolean isInsuranceNeeded;
    private int sum;

    public OrderResponseDto(int id, LocalDateTime date, String orderStatus, String carDescription, LocalDateTime startRentalDate, LocalDateTime endRentalDate, boolean isInsuranceNeeded,  int sum) {
        super(id, date, orderStatus);
        this.carDescription = carDescription;
        this.startRentalDate = startRentalDate;
        this.endRentalDate = endRentalDate;
        this.isInsuranceNeeded = isInsuranceNeeded;
        this.sum = sum;
    }
}