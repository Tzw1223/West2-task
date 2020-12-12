package zhaji;

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

    @Override
    public void printStackTrace() {
        System.out.println("进货费用超出拥有余额！");
    }
}
