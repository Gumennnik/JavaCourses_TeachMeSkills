package Classwork12;

public class Thread02 implements Runnable {



    @Override
    public void run() {
        System.out.println("Tread " +  this.toString() + " is running");

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " i is " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                
            }
        }

    }
}
