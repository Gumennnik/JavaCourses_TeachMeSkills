package Classwork06;

public class Triangle implements Drawable {
    @Override
    public void draw() {
        for (int i = 1; i < 6 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
