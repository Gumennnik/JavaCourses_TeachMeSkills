package Classwork12;

public class Person extends Thread{
    private Account account;

    public Person(String personName, Account account) {
        setName(personName);
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5 ; i++) {
            account.moneyEjection(100);
        }
    }


}
