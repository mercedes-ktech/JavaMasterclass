import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReservedItemsList {

    private final Map<String, StockItem> reservedList;

    public ReservedItemsList() {
        this.reservedList = new LinkedHashMap<>();
    }

    public int addItemToReservedList(StockItem item) {
        if((item != null) && (item.quantityReserved() <= item.quantityInStock())) {
            // check if already have quantities of this item
            StockItem reserved = reservedList.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if(reserved != item) {
                item.adjustReservedStock(reserved.quantityReserved());
            }

            reservedList.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int removeItemsFromReservedList(String item, int quantity) {
        StockItem reserved = reservedList.getOrDefault(item, null);

        if((reserved != null) && (reserved.quantityReserved() >= quantity) && (quantity >0)) {
            reserved.adjustReservedStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return reservedList.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : reservedList.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(reservedList);
    }

    @Override
    public String toString() {
        String s = "\nReserved List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : reservedList.entrySet()) {
            StockItem reserved = item.getValue();

            double itemValue = reserved.getPrice() * reserved.quantityReserved();

            s = s + reserved + ". There are " + reserved.quantityReserved() + " reserved in basket. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total basket value " + totalCost;
    }
}
