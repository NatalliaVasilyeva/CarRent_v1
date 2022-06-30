package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

public class CarRentalTime implements Entity, Serializable {

    private long id;
    private long carId;
    private Instant startRentalDate;
    private Instant endRentalDate;

    public CarRentalTime() {
    }

    private CarRentalTime(long id, long carId, Instant startRentalDate, Instant endRentalDate) {
        this.id = id;
        this.carId = carId;
        this.startRentalDate = startRentalDate;
        this.endRentalDate = endRentalDate;
    }

    @Override
    public long getId() {
        return id;
    }

    public long getCarId() {
        return carId;
    }

    public Instant getStartRentalDate() {
        return startRentalDate;
    }

    public Instant getEndRentalDate() {
        return endRentalDate;
    }

    public static final class Builder {

        private long id;
        private long carId;
        private Instant startRentalDate;
        private Instant endRentalDate;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder car(long carId) {
            this.carId = carId;
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
            rentalTime.carId = this.carId;
            rentalTime.startRentalDate = this.startRentalDate;
            rentalTime.endRentalDate = this.endRentalDate;

            return rentalTime;
        }
    }
}