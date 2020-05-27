import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    void shouldAddItemToBasketWhenThereIsStock() {
        StockList stockList = new StockList();
        Basket merBasket = new Basket("Mer");

        Item item = new Item("cake", 1.10, 7);
        stockList.addStock(item);

        assertEquals(1, merBasket.addToBasket(item, 1), "returned value");
        assertEquals(1, merBasket.items().get(item), "content of basket");
        assertEquals(1, item.quantityReserved(), "reserved stock");
    }

    @Test
    void shouldNotAddItemToBasketWhenNoStock() {
        StockList stockList = new StockList();
        Basket merBasket = new Basket("Mer");

        Item item = new Item("cake", 1.10, 0);
        stockList.addStock(item);

        assertEquals(0, merBasket.addToBasket(item, 0), "returned value");
        assertEquals(null, merBasket.items().get(item), "content of basket");
        assertEquals(0, item.quantityReserved(), "reserved stock");
    }



    @Test
    void shouldRemoveItemFromBasketWhenItemIsInBasket() {
        StockList stockList = new StockList();
        Basket merBasket = new Basket("Mer");

        Item item = new Item("cake", 1.10, 10);
        stockList.addStock(item);
        merBasket.addToBasket(item, 1);

        assertEquals(0, merBasket.removeFromBasket(item, 1), "returned value");
        assertEquals(null, merBasket.items().get(item), "content of basket");
        assertEquals(0, item.quantityReserved());
    }

    @Test
    void items() {
    }

    @Test
    void clearBasket() {
    }
}
