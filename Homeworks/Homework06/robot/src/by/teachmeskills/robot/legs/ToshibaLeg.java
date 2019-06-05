package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Toshiba leg just done step");
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
