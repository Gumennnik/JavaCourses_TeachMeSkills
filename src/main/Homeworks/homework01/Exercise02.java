package homework01;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Input length is " + args.length);

        if(args.length < 3)
        {
            System.out.println("Wrong input");
            return;
        }

        double firstSide = 0;
        double secondSide = 0 ;
        double thirdSide = 0;

        try {
            firstSide = Double.valueOf(args[0]);
            secondSide = Double.valueOf(args[1]);
            thirdSide = Double.valueOf(args[2]);
        }catch (Exception e)
        {
            System.out.println("Cant parse input in double. Please check input");
            return;
        }

        if ( (firstSide + secondSide) < thirdSide) {
            System.out.println("This triangle can't exist");
            return;
        } else if ((secondSide + thirdSide) < firstSide) {
            System.out.println("This triangle can't exist");
            return;
        } else if ((thirdSide + firstSide) < secondSide) {
            System.out.println("This triangle can't exist");
            return;
        }

        System.out.println("This triangle exists");
        return;




    }





}
