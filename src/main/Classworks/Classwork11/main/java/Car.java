package Classwork11.main.java;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {


    private String mark;

    private int maxSpeed;
    private int price;

    private static final long serialVersionUID = 3L;

    public Car(String mark, int maxSpeed, int price) {
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getMaxSpeed() == car.getMaxSpeed() &&
                getPrice() == car.getPrice() &&
                Objects.equals(getMark(), car.getMark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getMaxSpeed(), getPrice());
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
