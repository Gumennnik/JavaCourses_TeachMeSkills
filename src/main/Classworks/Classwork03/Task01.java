package Classwork03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        int[] simpleArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < simpleArray.length ; i++) {
            simpleArray[i] = random.nextInt(100);
            System.out.println(simpleArray[i]);
        }


        System.out.println("One kmore task");

        for (int i = 1; i <= simpleArray.length ; i++) {
                System.out.println(simpleArray[simpleArray.length - i]);
        }

        System.out.println("*********************************");
        for (int i = 0; i < simpleArray.length ; i++) {
            if (simpleArray[i] % 2 == 0) {
                System.out.println(simpleArray[ i]);
            }
        }

        System.out.println(Arrays.toString(simpleArray));

        System.out.println("*********************************");

        int summ = 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < simpleArray.length; i++) {
            summ += simpleArray[i];
            if (max < simpleArray[i]) {
                max = simpleArray[i];
            }

        }

        System.out.println("Summ is " + summ);
        System.out.println("Max value is " + max);



//        Random randomGenerator = new Random();
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Please input number");
//
//        int inputedNumber = scanner.nextInt();
//
//        System.out.println("You inputted " + inputedNumber);
//
//        int summ = 0;
//
//        for (int i = 0; i < inputedNumber; i++) {
//            int generatedNumber = randomGenerator.nextInt(20);
//            System.out.println("Generated number is " + generatedNumber);
//            if (generatedNumber % 2 != 0) {
//                summ += generatedNumber;
//            }
//
//        }
//
//        System.out.println("Summ is " + summ);





    }
}
