package org.dmdev.natalliavasilyeva.domain.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Car implements Identifiable {
    private long id;
    private Model model;
    private Color color;
    private String yearOfProduction;
    private String number;
    private String vin;
    private boolean isRepaired;
    private String image;
    private List<Accident> accidents;

    private List<Order> orders;

    public Car() {
        // empty default
    }

    private Car(
            long id,
            Model model,
            Color color,
            String yearOfProduction,
            String number,
            String vin,
            boolean isRepaired,
            String image,
            List<Accident> accidents,
            List<Order> orders) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.number = number;
        this.vin = vin;
        this.isRepaired = false;
        this.image = image;
        this.accidents = accidents;
        this.orders = orders;
    }

    public long getId() {
        return id;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public String getNumber() {
        return number;
    }

    public String getVin() {
        return vin;
    }

    public boolean isRepaired() {
        return isRepaired;
    }

    public String getImage() {
        return image;
    }

    public List<Accident> getAccidents() {
        return accidents;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && isRepaired == car.isRepaired && Objects.equals(model, car.model) && color == car.color && Objects.equals(yearOfProduction, car.yearOfProduction) && Objects.equals(number, car.number) && Objects.equals(vin, car.vin) && Objects.equals(image, car.image) && Objects.equals(accidents, car.accidents) && Objects.equals(orders, car.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, yearOfProduction, number, vin, isRepaired, image, accidents, orders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model=" + model +
                ", color=" + color +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", number='" + number + '\'' +
                ", vin='" + vin + '\'' +
                ", isRepaired=" + isRepaired +
                ", image='" + image + '\'' +
                ", accidents=" + accidents +
                ", orders=" + orders +
                '}';
    }

    public static final class Builder {

        private long id;
        private Model model;
        private Color color;
        private String yearOfProduction;
        private String number;
        private String vin;
        private boolean isRepaired;
        private String image;

        private List<Accident> accidents;

        private List<Order> orders;

        public Builder() {
            this.accidents = Collections.emptyList();
            this.orders = Collections.emptyList();
            this.isRepaired = false;
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder year(String year) {
            this.yearOfProduction = year;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder vin(String vin) {
            this.vin = vin;
            return this;
        }

        public Builder repaired(boolean isRepaired) {
            this.isRepaired = isRepaired;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder accidents(List<Accident> accidents) {
            this.accidents = accidents;
            return this;
        }

        public Builder orders(List<Order> orders) {
            this.orders = orders;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.id = this.id;
            car.model = this.model;
            car.color = this.color;
            car.yearOfProduction = this.yearOfProduction;
            car.number = this.number;
            car.vin = this.vin;
            car.isRepaired = this.isRepaired;
            car.image = this.image;
            car.accidents = this.accidents;
            car.orders = this.orders;
            return car;
        }
    }
}