package org.dmdev.natalliavasilyeva.domain.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class CarRentalTime implements ModelMarkInterface{

    private long id;
    private Car car;
    private Instant startRentalDate;
    private Instant endRentalDate;

    public CarRentalTime() {
    }

    private CarRentalTime(long id, Car car, Instant startRentalDate, Instant endRentalDate) {
        this.id = id;
        this.car = car;
        this.startRentalDate = startRentalDate;
        this.endRentalDate = endRentalDate;
    }

    public long getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public Instant getStartRentalDate() {
        return startRentalDate;
    }

    public Instant getEndRentalDate() {
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

        private long id;
        private Car car;
        private Instant startRentalDate;
        private Instant endRentalDate;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder car(Car car) {
            this.car = car;
            return this;
        }

        public Builder start(Instant startRentalDate) {
            this.startRentalDate = startRentalDate;
            return this;
        }

        public Builder end(Instant endRentalDate) {
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