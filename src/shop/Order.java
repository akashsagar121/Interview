package shop;

import java.util.*;

public class Order {
    List<OrderItem> orderItemList = new ArrayList<OrderItem>();

    public Order(List<String> order) throws Exception{
        for (String orderItemString : order){
            StringTokenizer st = new StringTokenizer(orderItemString,",");
            Drink drink = null;
            Set<Ingredient> removals = new HashSet<Ingredient>();
            if (st.hasMoreTokens()) {
                drink = ShopStore.getDrinkByName(st.nextToken());
            }
            if(drink != null) {
                while (st.hasMoreTokens()) {
                    Ingredient removal = ShopStore.getRemovalByName(st.nextToken()
                            .replaceFirst("^-", ""));
                    if(removal != null){
                        removals.add(removal);
                    } else {
                        throw new Exception("removal not found");
                    }
                }
            } else {
                throw new Exception("drik not found");
            }

            orderItemList.add(new OrderItem(drink,removals));
        }
    }

    public Double getBill(){
        Double price = 0.0;
            for(OrderItem orderItem : orderItemList){
                price += orderItem.drink.price - orderItem.getRemovalPrice();
            }
        return price;
    }
 }
