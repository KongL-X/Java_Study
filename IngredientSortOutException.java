package Chickenshop;

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

    public void Reflection1(Juice juice) {
        System.out.println(juice.name+"果汁售完");
    }

    public void Reflection2(Beers beers) {
        System.out.println(beers.name+"啤酒售完");
    }
}