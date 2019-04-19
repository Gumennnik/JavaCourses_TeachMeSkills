package homework01;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01 {


    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please input number");
        }

        int inputedNumber;

        try {
            inputedNumber = Integer.valueOf(args[0]);

        } catch (Exception e) {
            System.out.println("Cant parse inputed number");
            return;
        }



            System.out.println("This number has " + Integer.toString(Math.abs(inputedNumber)).length() + " digits");
            if (inputedNumber == 0) {
                System.out.println("Inputed value is 0");
            } else if (inputedNumber < 0) {
                System.out.println("Inputed value is less than zero");
            } else {
                System.out.println("Inputed value is greater than zero");
            }

            return;


    }
}
