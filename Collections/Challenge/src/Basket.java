import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> listOfItemsInBasket;

    public Basket(String name) {
        this.name = name;
        this.listOfItemsInBasket = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            if(item.quantityInStock() >= quantity) {
                int inBasket = listOfItemsInBasket.getOrDefault(item, 0);
                item.adjustReservedStock(quantity);
                listOfItemsInBasket.put(item, inBasket + quantity);
                return inBasket;
            }
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
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





    //como se tiene que comportar el metodo? que tiene que devolver? side effects?
        //item is null: no pasa nada. return 0
        //item is not in the basket: no pasa nada. return 0
        //item is in the basket and quantity is negative: no pasa nada. return la cantidad de ese item que queda en la cesta
        //item is in the basket and quantity is 0: no pasa nada. return la cantidad de ese item que queda en la cesta
        //item is in the basket and quantity > number of this item in basket: no pasa nada. return la cantidad de ese item que queda en la cesta




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


    public Map<StockItem, Integer> items() {
        return Collections.unmodifiableMap(listOfItemsInBasket);
    }

    public Map<StockItem, Integer> getListOfItemsInBasket() {
        return listOfItemsInBasket;
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + listOfItemsInBasket.size() + ((listOfItemsInBasket.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : listOfItemsInBasket.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
