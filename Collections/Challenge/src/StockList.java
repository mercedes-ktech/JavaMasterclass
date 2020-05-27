import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    //private final Map<String, Item> stockList;
    private final Object stockList;

    public StockList() {
        this.stockList = new LinkedHashMap<>();
    }

    public int addStock(Item item) {
        if(item != null) {
            // check if already have quantities of this item
            Item inStock = stockList.getOrDefault(item.getName(), item);
            // If there are already stock of this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }

            stockList.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int removeStock(String item, int quantity) {
        Item inStock = stockList.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity >0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public Item get(String key) {
        return stockList.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, Item> item : stockList.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, Item> getAllItems() {
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, Item> item : stockList.entrySet()) {
            Item stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock \n";
//            s = s + String.format("%.2f",itemValue) + "\n";
//            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}
