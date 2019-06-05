package Classwork06;

public class Sqare implements Drawable {

    @Override
    public void draw() {
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
