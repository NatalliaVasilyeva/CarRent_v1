package org.dmdev.natalliavasilyeva.persistence.jpa;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DriverLicense implements Entity, Serializable {

    private int id;
    private int number;
    private LocalDateTime issueDate;
    private LocalDateTime expiredDate;

    public DriverLicense() {
    }

    private DriverLicense(int id, int number, LocalDateTime issueDate, LocalDateTime expiredDate) {
        this.id = id;
        this.number = number;
        this.issueDate = issueDate;
        this.expiredDate = expiredDate;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDateTime getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDateTime expiredDate) {
        this.expiredDate = expiredDate;
    }

    public static final class Builder {

        private int id;
        private int number;
        private LocalDateTime issueDate;
        private LocalDateTime expiredDate;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public Builder issueDate(LocalDateTime issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder expiredDate(LocalDateTime expiredDate) {
            this.expiredDate = expiredDate;
            return this;
        }

        public DriverLicense build() {
            DriverLicense driverLicense = new DriverLicense();
            driverLicense.id = this.id;
            driverLicense.number = this.number;
            driverLicense.issueDate = this.issueDate;
            driverLicense.expiredDate = this.expiredDate;

            return driverLicense;
        }

    }
}