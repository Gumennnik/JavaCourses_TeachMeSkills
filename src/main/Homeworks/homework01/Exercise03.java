package homework01;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Iputed arguments list length is " + args.length);

        int inputedNumber = 0;
        try {
            inputedNumber = Integer.valueOf(args[0]);
        } catch (Exception e) {
            System.out.println("Cant parse to integer");
            return;
        }

        System.out.println("Firstly inputed number was " + inputedNumber);

        if (inputedNumber > 0) {
            inputedNumber++;
        }else if (inputedNumber < 0)
        {
            inputedNumber -= 2;
        }else if (inputedNumber == 0)
        {
            inputedNumber = 10;
        }

        System.out.println("New inputed number is " + inputedNumber);



    }
}
