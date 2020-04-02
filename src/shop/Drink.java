package shop;

import java.util.Set;

public class Drink {
    String name;
    Set<Ingredient> removals;
    Double price;

    public Drink(String name, Set<Ingredient> removals, Double price) throws Exception {
        this.name = name;
        this.removals = removals;
        this.price = price;
        if(price < 0  || getIngradiatePrice() > price) {
            throw new Exception("price in less than removals");
        }
    }

    private Double getIngradiatePrice() {
        Double totalPrice = 0.0;
        for (Ingredient ingredient : this.removals) {
            totalPrice += ingredient.price;
        }
        return totalPrice;
    }

}
