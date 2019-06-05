package Classwork12;

public class Account {
    private int balance = 500;

    public synchronized int moneyEjection(int moneySummForEject) {

        String threadName = Thread.currentThread().getName();

        System.out.println(Thread.currentThread().getName() + " wants to eject " + moneySummForEject);
        if (balance >= moneySummForEject) {
            System.out.println("For "  + threadName + " avaliable " + balance);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= moneySummForEject;
            System.out.println(threadName + " ejected " + moneySummForEject + " left " + balance);
            return moneySummForEject;
        } else {
            System.out.println("For " + threadName + " not enough money");
            return 0;
        }
    }


    public int getBalance() {
        return balance;
    }
}
