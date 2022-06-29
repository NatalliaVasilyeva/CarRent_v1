package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Order implements Entity, Serializable {

    private int id;

    private LocalDateTime date;
    private int carRentalTimeId;
    private int userId;
    private String passport;
    private boolean isInsuranceNeeded;
    private String orderStatus;
    private int sum;

    public Order() {
    }

    private Order(int id, LocalDateTime date, int carRentalTimeId, int userId, String passport, boolean isInsuranceNeeded, String orderStatus, int sum) {
        this.id = id;
        this.date = date;
        this.carRentalTimeId = carRentalTimeId;
        this.userId = userId;
        this.passport = passport;
        this.isInsuranceNeeded = isInsuranceNeeded;
        this.orderStatus = orderStatus;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getCarRentalTimeId() {
        return carRentalTimeId;
    }

    public void setCarRentalTimeId(int carRentalTimeId) {
        this.carRentalTimeId = carRentalTimeId;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String password) {
        this.passport = passport;
    }

    public boolean isInsuranceNeeded() {
        return isInsuranceNeeded;
    }

    public void setInsuranceNeeded(boolean insuranceNeeded) {
        isInsuranceNeeded = insuranceNeeded;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static final class Builder {
        private int id;

        private LocalDateTime date;
        private int carRentalTimeId;
        private int userId;
        private String passport;
        private boolean isInsuranceNeeded;
        private String orderStatus;
        private int sum;

        public Builder() {
            this.date = LocalDateTime.now();
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder id(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Builder carRentalTime(int carRentalTimeId) {
            this.carRentalTimeId = carRentalTimeId;
            return this;
        }

        public Builder user(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder passport(String passport) {
            this.passport = passport;
            return this;
        }

        public Builder insurance(boolean isInsuranceNeeded) {
            this.isInsuranceNeeded = isInsuranceNeeded;
            return this;
        }

        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder sum(int sum) {
            this.sum = sum;
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.id = this.id;
            order.date = this.date;
            order.carRentalTimeId = carRentalTimeId;
            order.userId = this.userId;
            order.passport = this.passport;
            order.isInsuranceNeeded = this.isInsuranceNeeded;
            order.orderStatus = this.orderStatus;
            order.sum = this.sum;

            return order;
        }
    }


}