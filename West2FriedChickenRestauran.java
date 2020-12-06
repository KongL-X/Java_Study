package Chickenshop;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class West2FriedChickenRestauran implements chickenStore{

    public double amounts;
    public  ArrayList<Beers> BeersArrayList;
    public  ArrayList<Juice> JuiceArrayList ;
    public static ArrayList<SetMeal> SetMealArrayList;

    public void sell(SetMeal setMeal){

        SetMealArrayList.remove(setMeal);
        System.out.println("出售"+setMeal.mealName);
        if(setMeal.drinksName instanceof Beers)
        {
            BeersArrayList.remove(setMeal.drinksName);
            System.out.println("出售"+setMeal.drinksName.name+"啤酒");
        }
        else if(setMeal.drinksName instanceof Juice){
            JuiceArrayList.remove(setMeal.drinksName);
            System.out.println("出售"+setMeal.drinksName.name+"果汁");
        }

    }
    OverdraftBalanceException l;
    public void purchase(SetMeal setMeal){
          this.amounts=this.amounts-setMeal.price;
          if(this.amounts<0){
              l.lack(-this.amounts);
          }
          else{
              SetMealArrayList.add(setMeal);
              if(setMeal.drinksName instanceof Beers){
                  BeersArrayList.add((Beers) setMeal.drinksName);
              }
              else{
                  JuiceArrayList.add((Juice) setMeal.drinksName);
              }
          }
    }
    IngredientSortOutException p;

    private void use(Beers beers){
        if(BeersArrayList.contains(beers))
        {
            BeersArrayList.remove(beers);
        }
        else{
            p.Reflection2(beers);
         }
    }
    private void use(Juice juice){
        if(JuiceArrayList.contains(juice))
        {
            JuiceArrayList.remove(juice);
        }
        else{
            p.Reflection1(juice);
        }
    }
}
