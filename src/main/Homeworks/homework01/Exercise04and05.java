package homework01;

public class Exercise04and05 {
    public static void main(String[] args) {
        System.out.println("Inputed args length is " + args.length);

        int firstDouble = 0;
        int secondDouble = 0;
        int thirdDouble = 0;

        try {
            firstDouble = Integer.valueOf(args[0]);
            secondDouble = Integer.valueOf(args[1]);
            thirdDouble = Integer.valueOf(args[2]);

        }catch (Exception e)
        {
            System.out.println("Can't parse inputed numbers");
            return;
        }

        int positiveNumberCounter = 0;


        if (firstDouble >= 0){
            positiveNumberCounter++;
        }

        if (secondDouble >= 0) {
            positiveNumberCounter++;
        }

        if (thirdDouble >= 0) {
            positiveNumberCounter++;
        }

        System.out.println("Found " + positiveNumberCounter + " positive numbers and " + (3 - positiveNumberCounter));
        return;



    }
}
