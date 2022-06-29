package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CarRentalTime implements Entity, Serializable {

    private int id;
    private int carId;
    private LocalDateTime startRentalDate;
    private LocalDateTime endRentalDate;

    public CarRentalTime() {
    }

    private CarRentalTime(int id, int carId, LocalDateTime startRentalDate, LocalDateTime endRentalDate) {
        this.id = id;
        this.carId = carId;
        this.startRentalDate = startRentalDate;
        this.endRentalDate = endRentalDate;
    }

    @Override
    public int getId() {
        return id;
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

    public static final class Builder {

        private int id;
        private int carId;
        private LocalDateTime startRentalDate;
        private LocalDateTime endRentalDate;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder car(int carId) {
            this.carId = carId;
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
            rentalTime.carId = this.carId;
            rentalTime.startRentalDate = this.startRentalDate;
            rentalTime.endRentalDate = this.endRentalDate;

            return rentalTime;
        }
    }
}