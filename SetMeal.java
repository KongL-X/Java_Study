package Chickenshop;

public class SetMeal {
    public String mealName;
    public double price;
    public String chickenName;
    public Drinks drinksName;

    @Override
    public String toString() {
        return super.toString();
    }

    public SetMeal(String mealName, double price, String chickenName, Drinks drinksName) {
        this.mealName = mealName;
        this.price = price;
        this.chickenName = chickenName;
        this.drinksName = drinksName;
    }
}
