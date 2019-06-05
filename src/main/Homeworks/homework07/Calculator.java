package homework07;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private String chosenOperation;
    private ArrayList<String> avaliableOperations = new ArrayList<>();

    {
        avaliableOperations.add("*");
        avaliableOperations.add("/");
        avaliableOperations.add("+");
        avaliableOperations.add("-");
    }

    private boolean grabInput() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please input first number and press enter : ");
                firstNumber = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Can't read inputted number");
                continue;
            }
        }

        while (true) {
            try {
                showOptions();
                System.out.print("  \n");
                chosenOperation = scanner.next();

                if (avaliableOperations.contains(chosenOperation)) {
                    break;
                } else {
                    throw new Exception();
                }


            } catch (Exception e) {
                System.out.println("Incorrect option inputted");
            }
        }

        while (true) {
            try {
                System.out.println("Please input second number and press enter : ");
                secondNumber = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Can't read inputted number");
                continue;
            }
        }



        System.out.println("All options inputted correctly");


        return true;
    }


    public void calculate() {
        System.out.print("\nResult is ");
        switch (chosenOperation) {
            case "+":
                System.out.print(firstNumber + secondNumber);
                break;
            case "-":
                System.out.print(firstNumber - secondNumber);
                break;
            case "*":
                System.out.print(firstNumber * secondNumber);
                break;
            case "/":
                System.out.print(firstNumber / secondNumber);
                break;

        }
        System.out.println();


    }


    private void showOptions() {
        System.out.println("Select operation and press enter\n Available options: \n+\n-\n/\n*");

    }


    public Calculator() {
        grabInput();
    }
}
