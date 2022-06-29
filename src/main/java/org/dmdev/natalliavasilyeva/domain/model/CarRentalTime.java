package org.dmdev.natalliavasilyeva.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class CarRentalTime {

    private int id;
    private Car car;
    private LocalDateTime startRentalDate;
    private LocalDateTime endRentalDate;

    public CarRentalTime() {
    }

    private CarRentalTime(int id, Car car, LocalDateTime startRentalDate, LocalDateTime endRentalDate) {
        this.id = id;
        this.car = car;
        this.startRentalDate = startRentalDate;
        this.endRentalDate = endRentalDate;
    }

    public int getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public LocalDateTime getStartRentalDate() {
        return startRentalDate;
    }

    public LocalDateTime getEndRentalDate() {
        return endRentalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarRentalTime that = (CarRentalTime) o;
        return id == that.id && Objects.equals(car, that.car) && Objects.equals(startRentalDate, that.startRentalDate) && Objects.equals(endRentalDate, that.endRentalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, car, startRentalDate, endRentalDate);
    }

    @Override
    public String toString() {
        return "CarRentalTime{" +
                "id=" + id +
                ", car=" + car +
                ", startRentalDate=" + startRentalDate +
                ", endRentalDate=" + endRentalDate +
                '}';
    }

    public static final class Builder {

        private int id;
        private Car car;
        private LocalDateTime startRentalDate;
        private LocalDateTime endRentalDate;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder car(Car car) {
            this.car = car;
            return this;
        }

        public Builder start(LocalDateTime startRentalDate) {
            this.startRentalDate = startRentalDate;
            return this;
        }

        public Builder end(LocalDateTime endRentalDate) {
            this.endRentalDate = endRentalDate;
            return this;
        }

        public CarRentalTime build() {
            CarRentalTime rentalTime = new CarRentalTime();
            rentalTime.id = this.id;
            rentalTime.car = this.car;
            rentalTime.startRentalDate = this.startRentalDate;
            rentalTime.endRentalDate = this.endRentalDate;

            return rentalTime;
        }
    }
}