import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<Item, Integer> listOfItemsInBasket;

    public Basket(String name) {
        this.name = name;
        this.listOfItemsInBasket = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public int addToBasket(Item item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            if(item.quantityInStock() >= quantity) {
                int inBasket = listOfItemsInBasket.getOrDefault(item, 0);
                item.adjustReservedStock(quantity);
                listOfItemsInBasket.put(item, inBasket + quantity);
                return inBasket + quantity;
            }
        }
        return 0;
    }

    public int removeFromBasket(Item item, int quantity) {
        if((item != null) && listOfItemsInBasket.containsKey(item)) {
            if((quantity > 0) && (quantity <= listOfItemsInBasket.get(item).intValue())) {
                int inBasket = listOfItemsInBasket.get(item) - quantity;
                item.adjustReservedStock(-quantity);

                if(inBasket == 0) {
                    listOfItemsInBasket.remove(item);
                }
                return inBasket;
            }
        }
        return 0;
    }
//        if((item != null) && (quantity > 0) && (quantity <= )
        //comprobar que la cantidad del item to remove es menor o igual que la cantidad que hay en la cesta
        //disminuir la cantidad de reservedQuantity accordingly
        //disminuir la cantidad del item de la cesta
        //si queda 0 de ese item en la cesta, remove item de la cesta
        //return la cantidad de ese item que queda en la cesta


/*
        //IF(item is not null && item is in the basket) {
            //IF((quantity > 0) && (quantity <= number of this item in the basket))
                //reservedQuantity - quantity
                //number of this item in Basket - quantity
                //IF number of this item in basket = 0
                    //remove item from basket
            //RETURN number of this item in basket
        //}
        //RETURN 0


    //how does the method behave? what does it have to return? side effects?
        //item is null: nothing happens. return 0
        //item is not in the basket: nothing happens. return 0
        //item is in the basket and quantity is negative: nothing happens. return the quantity of that item in the basket
        //item is in the basket and quantity is 0: nothing happens. return the quantity of that item in the basket
        //item is in the basket and quantity > number of this item in basket: nothing happens. return the quantity of that item in the basket
 */

//    public int removeFromBasket(StockItem item, int quantity) {
//        if ((item != null) && (quantity > 0) && (quantity <= item.quantityReserved())) {
//            int inBasket = listOfItemsInBasket.getOrDefault(item, 0);
//            item.adjustReservedStock(-quantity);
//            listOfItemsInBasket.remove(item, inBasket + quantity);
//            return inBasket;
//        }
//        return 0;
//    }


    public Map<Item, Integer> items() {
        return Collections.unmodifiableMap(listOfItemsInBasket);
    }

//    public Map<StockItem, Integer> getListOfItemsInBasket() {
//        return listOfItemsInBasket; THIS IS WRONG. BETTER NOT TO RETURN A MAP but an unmodifiable map
//    }

    public void clearBasket() {
        for(Map.Entry<Item, Integer> item : listOfItemsInBasket.entrySet()) {
            item.getKey().adjustReservedStock(-item.getValue());
        }
        listOfItemsInBasket.clear();
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + listOfItemsInBasket.size() + ((listOfItemsInBasket.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<Item, Integer> item : listOfItemsInBasket.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
