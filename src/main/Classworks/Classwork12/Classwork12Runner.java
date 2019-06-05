package Classwork12;

public class Classwork12Runner {

    public static void main(String[] args) {

        System.out.println("Main started");
//
//        Thread thread00 = new Thread(new Thread02());
//        Thread thread01 = new Thread(new Thread02());
//        Thread thread02 = new Thread(new Thread02());
//        Thread thread03 = new Thread(new Thread02());
//
//        thread00.setName("A");
//        thread01.setName("B");
//        thread02.setName("C");
//        thread03.setName("D");
//
//
//        thread02.start();
//        thread03.start();
//        thread01.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        thread00.start();
//        try {
//            thread00.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//


        Account account = new Account();
        Person person01 = new Person("Vasya", account);
        Person person02 = new Person("Sveta",account);

        person01.start();
        person02.start();


        System.out.println("Main ended");

    }
}
