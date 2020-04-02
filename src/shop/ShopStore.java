package shop;

import java.util.ArrayList;
import java.util.List;

public class ShopStore {
    static public List<Drink> drinks = new ArrayList<Drink>();
    static public List<Ingredient> removals = new ArrayList<Ingredient>();

    static Drink getDrinkByName(String name){
        for(Drink drink : drinks){
            if(drink.name.equals(name)){
                return drink;
            }
        }
        return null;
    }

    static Ingredient getRemovalByName(String name){
        for(Ingredient drink : removals){
            if(drink.name.equals(name)){
                return drink;
            }
        }
        return null;
    }
}
