package homework01;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println("Inputed " + args.length + " arguments");

        double firstInputedNumber = 0;
        double secondInputedNumber = 0;

        try {
            firstInputedNumber = Double.valueOf(args[0]);
            secondInputedNumber = Double.valueOf(args[1]);
        } catch (Exception e) {
            System.out.println("Can't parse inputed numbers");
            return;
        }


        if (firstInputedNumber > secondInputedNumber) {
            System.out.println("First number is greater");
            return;
        }

        if (secondInputedNumber > firstInputedNumber) {
            System.out.println("Second number is greater");
            return;
        }

        System.out.println("Numbers are equal");



    }
}
