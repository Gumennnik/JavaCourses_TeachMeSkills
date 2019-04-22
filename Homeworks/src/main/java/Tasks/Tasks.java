package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {


        final int MAX_VALUE_FOR_GENERATOR = 40;

        Tasks tasks = new Tasks();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Pleas input matrix size : \n ");
        int sizeForNeMarix = scanner.nextInt();

        System.out.println("Generating matrix");

        int[][] newMatrix = tasks.generateEmptyMatrixWithRandomNumbers(sizeForNeMarix, MAX_VALUE_FOR_GENERATOR);

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(" " + newMatrix[i][j]);
            }
            System.out.println("");
        }

        tasks.task01(newMatrix);
        tasks.task02(newMatrix);
        tasks.task03(newMatrix);
        tasks.task04(newMatrix);
        tasks.task05(newMatrix);


    }

    public void task05 (int[][] newMatrix) {

        System.out.println("Transponsed matrix is : ");

        for (int i = 0; i < newMatrix.length ; i++) {
            for (int j = 0; j < newMatrix.length ; j++) {
                System.out.print(newMatrix[j][i] + " ");
            }
            System.out.println("");
        }

        return;
    }


    public void task04(int[][] newMatrix) {

        int summNonOdd = 0;

        for (int i = 1; i < newMatrix.length ; i++) {
                if (newMatrix[i][newMatrix.length - 1 - i] % 2 == 0) {
                    summNonOdd += newMatrix[i][newMatrix.length - 1 - i];
            }
        }

        System.out.println("Summ of even elements over secondary diagonal is " + summNonOdd);

        return;
    }

    public void task03(int[][] newMatrix) {


        int multipleForMainDiagonal = 1;
        int multipleForSecondaryDiagonal = 1;


        for (int i = 0; i < newMatrix.length ; i++) {
            multipleForMainDiagonal *= newMatrix[i][i];
            multipleForSecondaryDiagonal *= newMatrix[i][newMatrix.length - i - 1];

        }

        System.out.println("Multiple for main diagonal " + multipleForMainDiagonal);
        System.out.println("Multiple for secondary diagonal " + multipleForSecondaryDiagonal);

        if (multipleForMainDiagonal > multipleForSecondaryDiagonal) {
            System.out.println("Multiple for main diagonal is greater");
        } else {
            System.out.println("Multiple for secondary diagonal is greater");
        }



        return;
    }

    public void task02(int[][] newMatrix) {

        System.out.println("Printing odd numbers under main diagonal");
        for (int i = 0; i < newMatrix.length - 1; i++) {
            if (newMatrix[i + 1][i] % 2 != 0) {
                System.out.println("From main diagonal " + newMatrix[i][i]);
                System.out.println("From secondary "+ newMatrix[i + 1][i]);
            }
        }
        if (newMatrix[newMatrix.length -1][newMatrix.length -1] % 2 != 0) {
            System.out.println("From main diagonal " + newMatrix[newMatrix.length -1][newMatrix.length -1]);
        }

        return;
    }

    public void task01(int[][] newMatrix) {

        int multipliedValues = 1;

        for (int i = 0; i < newMatrix.length; i++) {
            multipliedValues *= newMatrix[i][i];
        }

        System.out.println("Multiplied values are = " + multipliedValues);

        return;
    }

    public int[][] generateEmptyMatrixWithRandomNumbers(int sizeForNewMatrix, int maxBound) {

        Random random = new Random();
        int[][] targetMatrix = new int[sizeForNewMatrix][sizeForNewMatrix];


        for (int i = 0; i < sizeForNewMatrix; i++) {
            for (int j = 0; j < sizeForNewMatrix; j++) {
                targetMatrix[i][j] = 10 + random.nextInt(maxBound);
            }
        }

        return targetMatrix;
    }

}
