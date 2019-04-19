package Classwork02;

public class ClassworkExercise03 {
    public static void main(String[] args) {

        int firstInputed = 0;
        int secondInputed = 0;
        try {
            firstInputed = Integer.valueOf(args[0]);
            secondInputed = Integer.valueOf(args[1]);
        } catch (Exception e) {
            System.out.println("Wrong input");
            return;
        }

        while (firstInputed > secondInputed) {
            firstInputed--;
            secondInputed++;

        }

        while (secondInputed > firstInputed) {
            secondInputed--;
            firstInputed++;
        }

        System.out.println( "New median are " + firstInputed + " and " + secondInputed);

    }
}
