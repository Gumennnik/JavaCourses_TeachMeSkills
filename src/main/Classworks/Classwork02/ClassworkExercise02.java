package Classwork02;

import java.util.LinkedList;
import java.util.List;

public class ClassworkExercise02 {
    public static void main(String[] args) {
        List<Integer> numberList = new LinkedList<>();

        try {
            for (String inputedFromArg : args) {
                numberList.add(Integer.valueOf(inputedFromArg));
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            return;
        }

        int biggerNumber = numberList.get(0);
        int lesserNumber = numberList.get(0);

        for (int i : numberList) {
            if (i > biggerNumber) {
                biggerNumber = i;
            }

            if (i < lesserNumber) {
                lesserNumber = i;
            }
        }

        System.out.println("Bigger number is " + biggerNumber);
        System.out.println("Lesser number is " + lesserNumber);

    }
}
