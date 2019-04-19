package homework01;

public class Exercise07 {
    public static void main(String[] args) {
        System.out.println("Inputed " + args.length + " arguments");

        int numberOfProgramers = 0;

        try {
            numberOfProgramers = Integer.valueOf(args[0]);
        }catch (Exception e)
        {
            System.out.println("Cant parse inputed number");
            return;
        }

        int numberOfProgramersSwitcher = numberOfProgramers % 100;

        String ending = "";

        switch (numberOfProgramersSwitcher) {
            case 11 :
            case 12 :
            case 13 :
            case 14 :
                    ending = " програмистов";
        }

        if (ending == "") {
            switch (numberOfProgramersSwitcher % 10) {
                case 1:
                    ending = " программист";
                    break;
                case 2:
                case 3:
                case 4:
                    ending = " программиста";
                    break;
                default:
                    ending = " программистов";

            }
        }

        System.out.println(numberOfProgramers + ending);




    }
}
