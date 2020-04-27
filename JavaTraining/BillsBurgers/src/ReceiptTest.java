import org.junit.jupiter.api.Test;

public class ReceiptTest {

    @Test
    public void shouldPrintBurgerReceipt() {

        BurgerComponent[] additionalComponents = new BurgerComponent[]{
                new BurgerComponent("tomato", 0.5),
                new BurgerComponent("roquefort", 2.5)
        };
        Burger burger = new Burger(additionalComponents);

        Receipt.printReceipt(burger, additionalComponents);
    }

    @Test
    public void shouldPrintHealthyBurgerReceipt() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{
                new BurgerComponent("tomato", 0.5),
                new BurgerComponent("roquefort", 2.5)
        };
        HealthyBurger healthyBurger = new HealthyBurger(additionalComponents);
        Receipt.printReceipt(healthyBurger, additionalComponents);
    }

    @Test
    public void shouldPrintDeluxeBurgerMealReceipt() {

        Burger burger = new Burger();
        MealComponent[] mealComponents = new MealComponent[]{new MealComponent("Chips"), new MealComponent("drink")};
        DeluxeBurgerMeal deluxeBurgerMeal = new DeluxeBurgerMeal(burger, mealComponents);

        Receipt.printReceipt(deluxeBurgerMeal, mealComponents);

    }
}
