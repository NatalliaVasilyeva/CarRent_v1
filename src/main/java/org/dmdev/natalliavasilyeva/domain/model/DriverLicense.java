package org.dmdev.natalliavasilyeva.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class DriverLicense {

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

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public LocalDateTime getExpiredDate() {
        return expiredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverLicense that = (DriverLicense) o;
        return id == that.id && number == that.number && Objects.equals(issueDate, that.issueDate) && Objects.equals(expiredDate, that.expiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, issueDate, expiredDate);
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "id=" + id +
                ", number=" + number +
                ", issueDate=" + issueDate +
                ", expiredDate=" + expiredDate +
                '}';
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