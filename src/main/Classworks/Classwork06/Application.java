package Classwork06;

import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Started");
        run();
        System.out.println("Ended");
    }


    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    private void run() {
        while (true) {
            showMenu();
            int userChise = scanner.nextInt();
            Drawable figure = getFigureUserChosen(userChise);
            if (figure == null) {
                System.out.println("No figure found");
                return;
            }

            figure.draw();



        }
    }

    private Drawable getFigureUserChosen(int userChise) {

        Drawable chosenFigure;
        switch (userChise){
            case 1:
                return new Sqare();
            case 2:
                return new  Triangle();
            case 3:
                return new Circle();
                default:
            return null;
        }
    }

    private void showMenu() {
        System.out.println("What do u wand to draw? ");
        System.out.println("1 for square");
        System.out.println("2 for triangle");
        System.out.println("3 for circle");
        System.out.println("0 for exit");
    }

}
