package homework07;

public class CarStartFailException extends Exception {
    int failNumber = 0;



    public CarStartFailException(int failNumber) {
        super();
        this.failNumber = failNumber;
    }

    public int getFailNumber() {
        return failNumber;
    }
}
