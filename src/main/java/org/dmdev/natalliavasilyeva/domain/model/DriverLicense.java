package org.dmdev.natalliavasilyeva.domain.model;

import java.time.Instant;
import java.util.Objects;

public class DriverLicense implements Identifiable {

    private long id;
    private String number;
    private Instant issueDate;
    private Instant expiredDate;

    public DriverLicense() {
    }

    private DriverLicense(long id, String number, Instant issueDate, Instant expiredDate) {
        this.id = id;
        this.number = number;
        this.issueDate = issueDate;
        this.expiredDate = expiredDate;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Instant getIssueDate() {
        return issueDate;
    }

    public Instant getExpiredDate() {
        return expiredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverLicense that = (DriverLicense) o;
        return id == that.id && Objects.equals(number, that.number) && Objects.equals(issueDate, that.issueDate) && Objects.equals(expiredDate, that.expiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, issueDate, expiredDate);
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", issueDate=" + issueDate +
                ", expiredDate=" + expiredDate +
                '}';
    }

    public static final class Builder {

        private long id;
        private String number;
        private Instant issueDate;
        private Instant expiredDate;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder issueDate(Instant issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder expiredDate(Instant expiredDate) {
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