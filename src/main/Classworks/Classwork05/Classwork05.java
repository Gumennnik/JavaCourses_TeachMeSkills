package Classwork05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Classwork05 {
    public static void main(String[] args) {





    }

    private void reviewTask() {
        Random random = new Random();

        int[][] matrix = new int[5][5];

        int maxSumm = 0;
        int coulunmNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            int summCandidat = 0;

            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 10 + random.nextInt(10);
                summCandidat += matrix[j][i];

            }
            if (summCandidat > maxSumm) {
                maxSumm = summCandidat;
                coulunmNumber = i;
            }
            System.out.println("");
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        System.out.println("Max summ in " + coulunmNumber + " and is " + maxSumm);
    }

}
