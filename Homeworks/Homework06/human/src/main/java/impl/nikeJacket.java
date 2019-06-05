package impl;

import api.IJacket;

public class nikeJacket implements IJacket {
    private int price;
    private boolean isPuttedOn = false;
    private String jacketName = "";

    public void putOn() {
        if (!isPuttedOn) {
            System.out.println("Nike jacket is putted on");
            this.isPuttedOn = true;
        } else {
            System.out.println("KNike jacket is already putted on");
        }

    }

    public void putOff() {
        if (isPuttedOn) {
            System.out.println("Nike jacket is putted off");
            isPuttedOn = false;
        } else {
            System.out.println("Nike jacket is already putted off");
        }

    }

    public String getClothersName() {
        return this.jacketName;
    }

    public nikeJacket(int price , String jacketName) {
        this.price = price;
        this.jacketName = jacketName;
    }

    public nikeJacket() {
    }
}
