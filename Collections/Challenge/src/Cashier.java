import java.util.Map;

public class Cashier {

    public static void checkOut(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.getListOfItemsInBasket().entrySet()) {
            item.getKey().adjustStock(-item.getValue());
            basket.removeFromBasket(item.getKey(), item.getValue());
        }
        basket.getListOfItemsInBasket().clear();
    }
}
