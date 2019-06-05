package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    @Override
    public void step() {
        System.out.println("Sony leg just done step");
    }

    public SonyLeg() {
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
