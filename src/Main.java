import shop.Drink;
import shop.Ingredient;
import shop.Order;
import shop.ShopStore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Ingredient suger = new Ingredient("suger", 0.5);
            Ingredient milk = new Ingredient("milk", 1.0);
            Ingredient water = new Ingredient("water", 0.5);
            Ingredient soda = new Ingredient("soda", 0.5);
            Ingredient mint = new Ingredient("mint", 0.5);
            HashSet chaiRemovals = new HashSet();
            chaiRemovals.add(suger);
            chaiRemovals.add(milk);
            chaiRemovals.add(water);
            Drink chai = new Drink("chai", chaiRemovals, 5.0);
            Drink coffe = new Drink("coffe", chaiRemovals, 5.0);
            Drink bananaSmoothie = new Drink("bananaSmoothie", chaiRemovals, 5.0);
            Drink strawBarriesShake = new Drink("strawBarriesShake", chaiRemovals, 5.0);

            ShopStore.drinks.add(chai);
            ShopStore.drinks.add(coffe);
            ShopStore.drinks.add(bananaSmoothie);
            ShopStore.drinks.add(strawBarriesShake);

            ShopStore.removals.add(milk);
            ShopStore.removals.add(suger);
            ShopStore.removals.add(water);

            List<String> orderList = new ArrayList<>();
            orderList.add("chai,-suger,-milk");
            orderList.add("coffe,-milk");
            Order order = new Order(orderList);

            System.out.println(order.getBill());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
