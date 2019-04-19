package Task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int arrraySize;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input limit");
        arrraySize = inputScanner.nextInt();
        int[] arrayWithNumbers = new int[arrraySize];
        for (int i = 0; i < arrayWithNumbers.length; i++) {
            arrayWithNumbers[i] = (i +1)*2;
        }
        System.out.println(" In One line :");
        for (int i : arrayWithNumbers) {
            System.out.print(" " +i );

        }

        System.out.println("\n Each in new line: ");
        for (int i : arrayWithNumbers) {
            System.out.println(" " +i );

        }
    }

}
