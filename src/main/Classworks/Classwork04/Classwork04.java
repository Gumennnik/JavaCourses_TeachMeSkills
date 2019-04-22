package Classwork04;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Classwork04 {
    public static void main(String[] args) {

        Classwork04 classwork04 = new Classwork04();
        final int MAX_VALUE_OF_MATRIX_ELEMENT = 20;

        System.out.println("Please input array size");
        int arraySize = new Scanner(System.in).nextInt();

        Integer[][] generatedArray = classwork04.generateArray(arraySize, MAX_VALUE_OF_MATRIX_ELEMENT);


        classwork04.reviewTask01(generatedArray);
//        classwork04.reviewTask02(generatedArray);
//        classwork04.reviewTask03(generatedArray);
//        classwork04.reviewTask05(generatedArray);
//        classwork04.reviewTask06(generatedArray);
//        classwork04.sortArray(generatedArray);
//        classwork04.qSotrArray(generatedArray);
        classwork04.changeLines(generatedArray);
        classwork04.reviewTask01(generatedArray);


    }


    public void changeLines(Integer[][] generatedArray) {
        var buffer = generatedArray[0];
        generatedArray[0] = generatedArray[generatedArray.length -1];
        generatedArray[generatedArray.length -1] = buffer;
    }


    public void qSotrArray(Integer[] generatedArray) {



        Arrays.sort(generatedArray , Collections.reverseOrder());

        System.out.println("Sorted array is ");
            System.out.print(Arrays.toString(generatedArray));
        return;
    }

    public void sortArray(@NotNull int[] generatedArray) {

        for (int i = 0; i < generatedArray.length ; i++) {
            for (int j = 0; j < generatedArray.length - i - 1; j++) {
                if (generatedArray[j] < generatedArray[j +1]) {
                    int buffer = generatedArray[j];
                    generatedArray[j] = generatedArray[j + 1];
                    generatedArray[j + 1] = buffer;
                }
            }
        }
        System.out.println(" Sort finished ");
        for (int i = 0; i < generatedArray.length; i++) {
            System.out.print(" " + generatedArray[i]);
        }
        System.out.println( " \n ");


        return;
    }


    public void reviewTask06(int[] generatedArray) {

        int firstMax = generatedArray[0];
        int secondMax = generatedArray[0];

        for (int i = 0; i < generatedArray.length ; i++) {

            if (generatedArray[i] > firstMax) {
                firstMax = generatedArray[i];
            }

            if (generatedArray[i] < firstMax && generatedArray[i] > secondMax) {
                secondMax = generatedArray[i];
            }




        }

        System.out.println("First max is " + firstMax + " and second max is " + secondMax);

        return;
    }

    public void reviewTask05 (int[] generatedArray) {

        int nonOddSumm = 0;

        for (int i = 0; i < generatedArray.length ; i++) {
            if (generatedArray[i] % 2 == 0) {
                nonOddSumm += generatedArray[i];
            }
        }
        System.out.println("Non-odd summ is " + nonOddSumm);

        return;
    }

    public void reviewTask03(int[] generatedArray) {
        int max = generatedArray[0];
        int min = generatedArray[0];

        for (int i = 0; i < generatedArray.length; i++) {
            if (generatedArray[i] > max) {
                max = generatedArray[i];
            }
            if (generatedArray[i] < min) {
                min = generatedArray[i];
            }

        }

        System.out.println(" Max is " + max);
        System.out.println(" Min is " + min);

    }


    public void reviewTask02(int[] generatedArray) {
        System.out.println("Reverse is ");
        for (int i = 1; i <= generatedArray.length; i++) {
            System.out.print(" " + generatedArray[generatedArray.length - i]);
        }
        System.out.println(" ");
    }

    public void reviewTask01(Integer[][] generatedArray) {
        System.out.println(" array is ");
        int summ = 0;
        for (int i = 0; i < generatedArray.length; i++) {
            for (int j = 0; j < generatedArray.length; j++) {
                System.out.print(" " + generatedArray[i][j]);
                summ += generatedArray[i][j];
            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println(" Summ is  " + summ);

    }

    public Integer[][] generateArray(int arraySize, int maxValue) {
        var generatedArray = new Integer[arraySize][arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                generatedArray[i][j] = random.nextInt(maxValue);
            }

        }

        return generatedArray;
    }

}
