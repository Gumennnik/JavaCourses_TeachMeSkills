package main;

import java.util.ArrayList;
import java.util.Random;

public class Classwork {
    public static void main(String[] args) {
        System.out.println("Classwork 05.04.2019");

        System.out.println("Hello World");

        System.out.println("arg[0] is " + args[0]);


        int randomNumberFromInput = Integer.valueOf(args[0]);

        System.out.println("Number from input is " + randomNumberFromInput);

        int randomNumber = new Random().nextInt(200);

        System.out.println("Random number is " + randomNumber);

        if (randomNumber > randomNumberFromInput) {
            System.out.println("Random generated number greater that number from input");
        } else {
            System.out.println("Random generated number less than number from input");
        }


        String moreGrabbedParametrsFromInput = args[1];
        String andOneMoreFromInput = args[2];

        //"34567890" "Test with space" TestWithoutSpace

        switch (moreGrabbedParametrsFromInput) {
            case "":

                break;
            case "Test with space":
                System.out.println("found \"Test with space\"");
            case "TestWithoutSpace":
                System.out.println("Found TestWithoutSpace");
                break;

            default:
                System.out.println("Not found");

        }








    }


}
