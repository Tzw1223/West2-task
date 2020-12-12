package zhaji;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class West2FriedChickenRestaurant implements FriedChickenRestaurant {
    protected double balance; //余额
    /*集合元素个数不固定，可以任意扩容，List集合的特点是有序可重复，
    酒水食物不可能每种只存在一个，符合该特性。
    */
    protected List <Beer> beer = new ArrayList<>(); //啤酒列表
    protected List <Juice> juice = new ArrayList<>(); //果汁列表
    protected List <SetMeal> meal = new ArrayList<>(); //套餐列表

    private  boolean use (Beer b){
        ListIterator lit = beer.listIterator();
        while(lit.hasNext()){
            String s = (String) lit.next();
            if(b.equals(s)){
                lit.remove();
                return true;
            }
        }
        return false;
    }
    private boolean use (Juice j){
        ListIterator lit = juice.listIterator();
        while(lit.hasNext()){
            String s = (String) lit.next();
            if(j.equals(s)){
                lit.remove();
                return true;
            }
        }
        return false;
    }
    @Override
    public void sellMeal(SetMeal meal) {
        if(meal.drinks instanceof Beer){
           /* use((Beer) meal.drinks);
            balance += meal.price;*/
           try{
               boolean flag = use((Beer) meal.drinks);
               if(!flag)
                   throw new IngredientSortOutException();
               balance += meal.price;
           }catch (IngredientSortOutException e){
               e.printStackTrace();
               System.out.println("啤酒该进货啦！");
           }
        }
        else if(meal.drinks instanceof Juice){
            /*use((Juice) meal.drinks);
            balance += meal.price;*/
            try{
                boolean flag = use((Juice) meal.drinks);
                if(!flag)
                    throw new IngredientSortOutException();
                balance += meal.price;
            }catch (IngredientSortOutException e){
                e.printStackTrace();
                System.out.println("果汁该进货啦！");
            }
        }
    }
    @Override
    public void purchase(Drinks drinks) {
       try{
           if(drinks.cost > balance) {
               throw new OverdraftBalanceException();
           }
       }catch (OverdraftBalanceException e){
           e.printStackTrace();
           System.out.println("进货还差" + (drinks.cost - balance) +"元！" );
       }
    }
}
