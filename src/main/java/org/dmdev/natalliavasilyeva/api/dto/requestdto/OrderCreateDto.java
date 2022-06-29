package org.dmdev.natalliavasilyeva.api.dto.requestdto;

import java.time.LocalDateTime;

public class OrderCreateDto {

    private final static String DEFAULT_ORDER_STATUS = "CONFIRMATION_WAIT";

    private int carId;
    private LocalDateTime startRentalDate;
    private LocalDateTime endRentalDate;
    private int userId;
    private String passport;
    private boolean isInsuranceNeeded;
    private String orderStatus;

    public OrderCreateDto(int carId, LocalDateTime startRentalDate, LocalDateTime endRentalDate, int userId, String passport, boolean isInsuranceNeeded) {
        this.carId = carId;
        this.startRentalDate = startRentalDate;
        this.endRentalDate = endRentalDate;
        this.userId = userId;
        this.passport = passport;
        this.isInsuranceNeeded = isInsuranceNeeded;
        this.orderStatus = DEFAULT_ORDER_STATUS;
    }

    public int getCarId() {
        return carId;
    }

    public LocalDateTime getStartRentalDate() {
        return startRentalDate;
    }

    public LocalDateTime getEndRentalDate() {
        return endRentalDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassport() {
        return passport;
    }

    public boolean isInsuranceNeeded() {
        return isInsuranceNeeded;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}