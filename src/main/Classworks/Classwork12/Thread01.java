package Classwork12;

public class Thread01 extends Thread {




    @Override
    public void run() {

        System.out.println("Tread " +  this.toString() + " is running");

        super.run();
    }
}
