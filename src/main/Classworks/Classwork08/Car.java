package Classwork08;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private String mark;
    private int price;
    private int maxSpeed;

    @Override
    public String toString() {
        return mark + " " + price + " " + maxSpeed;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getPrice() == car.getPrice() &&
                getMaxSpeed() == car.getMaxSpeed() &&
                Objects.equals(getMark(), car.getMark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getPrice(), getMaxSpeed());
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public Car(String mark, int price, int maxSpeed) {
        this.mark = mark;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(@NotNull Car o) {


        if (this.getPrice() > o.getPrice()) {
            return 1;
        }

        if (this.getPrice() < o.getPrice()) {
            return -1;
        }


        return 0;
    }


}
