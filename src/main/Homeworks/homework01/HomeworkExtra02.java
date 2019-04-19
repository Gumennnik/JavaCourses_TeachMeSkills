package homework01;

public class HomeworkExtra02 {
    public static void main(String[] args) {

        int a;
        int b;

        try {
            a = Integer.valueOf(args[0]);
            b = Integer.valueOf(args[1]);
        } catch (NumberFormatException e)
        {
            System.out.println("Cant parse input. Please check parametrs");
            return;
        }catch (NullPointerException e)
        {
            System.out.println("Can't parse parametrs. Maybe some parameters are missing");
            return;
        }



        System.out.println(" a is " + a + " b is " + b);

        b += a;

        a = Math.abs(a-b);

        b -= a;

        System.out.println(" a is " + a + " b is " + b);

    }
}
