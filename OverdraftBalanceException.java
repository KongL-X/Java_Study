package Chickenshop;

public class OverdraftBalanceException extends RuntimeException {
    public OverdraftBalanceException() {
    }

    public OverdraftBalanceException(String message) {
        super(message);
    }

    public OverdraftBalanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public OverdraftBalanceException(Throwable cause) {
        super(cause);
    }

    public OverdraftBalanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public void lack(double k)
    {
        System.out.println("进货差"+k+"元钱");
    }
}
