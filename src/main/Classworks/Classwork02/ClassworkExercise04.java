package Classwork02;


public class ClassworkExercise04 {
    public static void main(String[] args) {

        int[] fibonachiSet = new int[10];
        fibonachiSet[0] = 1;
        fibonachiSet[1] = 1;

        for (int i = 2; i < 10; i++) {
            fibonachiSet[i] = fibonachiSet[i - 1] + fibonachiSet[i - 2];

        }

        for (int i : fibonachiSet) {
            System.out.println("Next fibonachi is " + i);
        }
    }
}
