package impl;

import api.IJacket;

public class abibasJacket implements IJacket {
    private int price;
    private String jacketName = "";
    private boolean isPuttedOn = false;

    public void putOn() {

    }

    public void putOff() {

    }

    public String getClothersName() {
        return null;
    }

    public abibasJacket() {
    }

    public abibasJacket(int price, String jacketName) {
        this.price = price;
        this.jacketName = jacketName;
    }
}
