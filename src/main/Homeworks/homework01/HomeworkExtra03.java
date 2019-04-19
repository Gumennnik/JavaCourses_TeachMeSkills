package homework01;

public class HomeworkExtra03 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        try {
            x = Double.valueOf(args[0]);
            y = Double.valueOf(args[1]);
            z = Double.valueOf(args[2]);

        } catch (NullPointerException e)
        {
            System.out.println("Arguments missing");
            return;
        } catch (NumberFormatException e)
        {
            System.out.println("Invalid format input");
            return;
        }

        System.out.println("Cos(x-2/3) is " + Math.cos(x - 2.0/3.0) );

        double result = 2.0*Math.cos(x - 2.0/3.0)*
                (1.0 + (Math.pow(z,2.0)/(3.0 - Math.pow(z,2.0)/5.0)))/
                (1.0/2.0 + Math.pow(Math.sin(y),2.0));
        System.out.println("Result is " + result);




    }
}
