package by.teachmeskills.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Toshiba head speaking");
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
