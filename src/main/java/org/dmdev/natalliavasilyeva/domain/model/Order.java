package org.dmdev.natalliavasilyeva.domain.model;


import java.time.LocalDateTime;
import java.util.Objects;

public class Order {

    private int id;
    private LocalDateTime date;
    private CarRentalTime carRentalTime;
    private User user;
    private String passport;
    private boolean isInsuranceNeeded;
    private OrderStatus orderStatus;
    private int sum;

    public Order() {
    }

    private Order(int id, LocalDateTime date, CarRentalTime carRentalTime, User user, String passport, boolean isInsuranceNeeded, OrderStatus orderStatus, int sum) {
        this.id = id;
        this.date = date;
        this.carRentalTime = carRentalTime;
        this.user = user;
        this.passport = passport;
        this.isInsuranceNeeded = isInsuranceNeeded;
        this.orderStatus = orderStatus;
        this.sum = sum;
    }

    public int getId() {
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

    public int getSum() {
        return sum;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && isInsuranceNeeded == order.isInsuranceNeeded && sum == order.sum && Objects.equals(carRentalTime, order.carRentalTime) && Objects.equals(user, order.user) && Objects.equals(passport, order.passport) && orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carRentalTime, user, passport, isInsuranceNeeded, orderStatus, sum);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", carRentalTime=" + carRentalTime +
                ", user=" + user +
                ", passport='" + passport + '\'' +
                ", isInsuranceNeeded=" + isInsuranceNeeded +
                ", orderStatus=" + orderStatus +
                ", sum=" + sum +
                '}';
    }

    public static final class Builder {
        private int id;

        private LocalDateTime date;
        private CarRentalTime carRentalTime;
        private User user;

        private String passport;
        private boolean isInsuranceNeeded;
        private OrderStatus orderStatus;
        private int sum;

        public Builder() {
            this.date = LocalDateTime.now();
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder date(LocalDateTime date) {
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

        public Builder sum(int sum) {
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