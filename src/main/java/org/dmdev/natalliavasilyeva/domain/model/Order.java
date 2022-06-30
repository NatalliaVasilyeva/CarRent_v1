package org.dmdev.natalliavasilyeva.domain.model;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Order implements Identifiable {

    private long id;
    private Instant date;
    private CarRentalTime carRentalTime;
    private User user;
    private String passport;
    private boolean isInsuranceNeeded;
    private OrderStatus orderStatus;
    private BigDecimal sum;

    public Order() {
    }

    private Order(long id, Instant date, CarRentalTime carRentalTime, User user, String passport, boolean isInsuranceNeeded, OrderStatus orderStatus, BigDecimal sum) {
        this.id = id;
        this.date = date;
        this.carRentalTime = carRentalTime;
        this.user = user;
        this.passport = passport;
        this.isInsuranceNeeded = isInsuranceNeeded;
        this.orderStatus = orderStatus;
        this.sum = sum;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getPassport() {
        return passport;
    }

    public CarRentalTime getCarRentalTime() {
        return carRentalTime;
    }

    public boolean isInsuranceNeeded() {
        return isInsuranceNeeded;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public Instant getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && isInsuranceNeeded == order.isInsuranceNeeded && Objects.equals(date, order.date) && Objects.equals(carRentalTime, order.carRentalTime) && Objects.equals(user, order.user) && Objects.equals(passport, order.passport) && orderStatus == order.orderStatus && Objects.equals(sum, order.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, carRentalTime, user, passport, isInsuranceNeeded, orderStatus, sum);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", carRentalTime=" + carRentalTime +
                ", user=" + user +
                ", passport='" + passport + '\'' +
                ", isInsuranceNeeded=" + isInsuranceNeeded +
                ", orderStatus=" + orderStatus +
                ", sum=" + sum +
                '}';
    }

    public static final class Builder {
        private long id;
        private Instant date;
        private CarRentalTime carRentalTime;
        private User user;
        private String passport;
        private boolean isInsuranceNeeded;
        private OrderStatus orderStatus;
        private BigDecimal sum;

        public Builder() {
            this.date = Instant.now();
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder date(Instant date) {
            this.date = date;
            return this;
        }

        public Builder carRentalTime(CarRentalTime carRentalTime) {
            this.carRentalTime = carRentalTime;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
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

        public Builder orderStatus(OrderStatus orderStatus) {
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
            order.carRentalTime = carRentalTime;
            order.user = this.user;
            order.passport = this.passport;
            order.isInsuranceNeeded = this.isInsuranceNeeded;
            order.orderStatus = this.orderStatus;
            order.sum = this.sum;

            return order;
        }
    }


}