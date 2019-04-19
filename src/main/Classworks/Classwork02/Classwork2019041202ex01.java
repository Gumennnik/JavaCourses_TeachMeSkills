package Classwork02;

public class Classwork2019041202ex01 {

    public static void main(String[] args) {

        int summEven = 0;
        int summOdd = 0;

        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 == 0) {
                summEven += i;
            } else {
                summOdd += i;
            }
        }

        System.out.println("Summ even is " + summEven);
        System.out.println("Summ odd is " + summOdd);

        System.out.println("All summ is " + (summEven + summOdd));





    }

}
