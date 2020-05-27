import java.util.Map;

public class Cashier {

    public static void checkOut(Basket basket) {
        for(Map.Entry<Item, Integer> item : basket.items().entrySet()) {
            item.getKey().adjustStock(-item.getValue());
        }
        basket.clearBasket();
    }

    public static String printReceipt(Basket basket) {
        String s = "\nShopping basket " + basket.getName() + " contains " + basket.items().size() + ((basket.items().size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<Item, Integer> item : basket.items().entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
