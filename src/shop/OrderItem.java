package shop;

import java.util.Set;

public class OrderItem {
    Drink drink;
    Set<Ingredient> removals;

    OrderItem(Drink drink, Set<Ingredient> removals) throws Exception{
        this.drink = drink;
        this.removals = removals;

        vaidateRemovals();
    }

    private void vaidateRemovals() throws Exception {
        for (Ingredient ingredient : this.removals) {
             if (drink.removals.contains(ingredient)){
               throw new  Exception ("invalid removal");
             }
        }
    }

    Double getRemovalPrice() {
        Double totalPrice = 0.0;
        for (Ingredient ingredient : this.removals) {
            totalPrice += ingredient.price;
        }
        return totalPrice;
    }
}
