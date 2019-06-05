package homework07;

import java.util.Random;

public class Car {
    private String mark = "";
    private int price;
    private int speed;

    public Car(String mark, int price, int speed) {
        this.mark = mark;
        this.price = price;
        this.speed = speed;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean startEngine() throws CarStartFailException {

        int numberToCheck = new Random().nextInt(20);

        if (numberToCheck % 2 == 0) {
            throw new CarStartFailException(numberToCheck);
        }

        return true;
    }
}
