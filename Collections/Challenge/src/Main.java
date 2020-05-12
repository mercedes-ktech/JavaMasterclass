/*
Modify the program so that adding items to the shopping basket doesn't
actually reduce the stock count but, instead, reserves the requested
number of items.

You will need to add a "reserved" field to the StockItem class to store the
number of items reserved.

Items can continue to be added to the basket, but it should not be possible to
reserve more than the available stock of any item. An item's available stock
is the stock count less the reserved amount.

The stock count for each item is reduced when a basket is checked out, at which
point all reserved items in the basket have their actual stock count reduced.

Once checkout is complete, the contents of the basket are cleared.

It should also be possible to "unreserve" items that were added to the basket
by mistake.

The program should prevent any attempt to unreserve more items than were
reserved for a basket.

Add code to Main that will unreserve items after they have been added to the basket,
as well as unreserving items that have not been added to make sure that the code
can cope with invalid requests like that.

After checking out the baskets, display the full stock list and the contents of each
basket that you created.

 */

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    private static ReservedItemsList reservedItemsList = new ReservedItemsList();
    private static Basket merBasket = new Basket("Mer");

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);
        addToBasket(temp,100, merBasket);
        System.out.println(temp.quantityReserved());
        removeFromBasket(temp, 2, merBasket);
        System.out.println(temp.quantityReserved());

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);
        addToBasket(temp, 15, merBasket);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(reservedItemsList);

        for(String s: stockList.allItems().keySet()) {
            System.out.println(s);
        }

        System.out.println(merBasket);

        //temp = new StockItem("pen", 1.12);
        //stockList.Items().put(temp.getName(), temp);
        stockList.allItems().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
        for(Map.Entry<String, Double> price: reservedItemsList.priceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.removeStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static void addToBasket(StockItem item, int quantity, Basket basket) {
        reservedItemsList.addItemToReservedList(item);
        basket.addToBasket(item, quantity);
    }

    public static void removeFromBasket(StockItem item, int quantity, Basket basket) {
        if(item.quantityReserved() >= quantity) {
            basket.removeFromBasket(item, quantity);
        }
    }

}
