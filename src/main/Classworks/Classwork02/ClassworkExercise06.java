package Classwork02;


public class ClassworkExercise06 {

    public static void main(String[] args) {
        String[][] butterFly = new String[17][17];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i >= j) {
                    butterFly[i][j] = String.valueOf(j + 1);
                    butterFly[16 - i][j] = String.valueOf(j + 1);
                    butterFly[16 - i][16 - j] = String.valueOf(j + 1);
                    butterFly[i][16 - j] = String.valueOf(j + 1);
                } else {
                    butterFly[i][j] = " ";
                    butterFly[16 - i][j] = " ";
                    butterFly[16 - i][16 - j] = " ";
                    butterFly[i][16 - j] = " ";
                }

            }
        }


        for (String[] row : butterFly) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println("");
        }


    }


}
