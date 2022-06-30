package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

public class Order implements Entity, Serializable {

    private long id;
    private Instant date;
    private long carRentalTimeId;
    private long userId;
    private String passport;
    private boolean isInsuranceNeeded;
    private String orderStatus;
    private BigDecimal sum;

    public Order() {
    }

    private Order(long id, Instant date, long carRentalTimeId, long userId, String passport, boolean isInsuranceNeeded, String orderStatus, BigDecimal sum) {
        this.id = id;
        this.date = date;
        this.carRentalTimeId = carRentalTimeId;
        this.userId = userId;
        this.passport = passport;
        this.isInsuranceNeeded = isInsuranceNeeded;
        this.orderStatus = orderStatus;
        this.sum = sum;
    }

    public long getId() {
        return id;
    }

    public Instant getDate() {
        return date;
    }

    public long getUserId() {
        return userId;
    }

    public long getCarRentalTimeId() {
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

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public static final class Builder {
        private long id;

        private Instant date;
        private long carRentalTimeId;
        private long userId;
        private String passport;
        private boolean isInsuranceNeeded;
        private String orderStatus;
        private BigDecimal sum;

        public Builder() {
            this.date = Instant.now();
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder id(Instant date) {
            this.date = date;
            return this;
        }

        public Builder carRentalTime(long carRentalTimeId) {
            this.carRentalTimeId = carRentalTimeId;
            return this;
        }

        public Builder user(long userId) {
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

        public Builder sum(BigDecimal sum) {
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