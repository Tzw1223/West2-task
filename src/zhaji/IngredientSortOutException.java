package zhaji;

public class IngredientSortOutException extends RuntimeException {
    public IngredientSortOutException() {
    }
    public IngredientSortOutException(String message) {
        super(message);
    }
    public IngredientSortOutException(String message, Throwable cause) {
        super(message, cause);
    }
    public IngredientSortOutException(Throwable cause) {
        super(cause);
    }
    public IngredientSortOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public void printStackTrace() {
        System.out.println("该饮料已售罄！");
    }
}
