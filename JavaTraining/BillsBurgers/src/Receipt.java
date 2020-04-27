import java.util.Arrays;

public class Receipt {

    public static void printReceipt(Burger burger, BurgerComponent[] additionalComponents) {

        for(int i = 0; i < additionalComponents.length; i++) {
            System.out.println(additionalComponents[i]);
        }

        System.out.println("Total Add-ons: " + burger.additionalComponents());
        System.out.println("Total Add-ons Price: " + burger.additionalComponentsPrice());
        System.out.println("Burger Base Price: " + burger.getBasePrice());
        System.out.println("Total Price: " + (burger.additionalComponentsPrice() + burger.getBasePrice()));
    }

    public static void printReceipt(DeluxeBurgerMeal deluxeBurgerMeal, MealComponent[] mealComponents) {

        System.out.println("Total Add-ons: " + deluxeBurgerMeal.burger.additionalComponents());
        System.out.println("Total Add-ons Price: " + deluxeBurgerMeal.burger.additionalComponentsPrice());
        System.out.println("Burger Base Price: " + deluxeBurgerMeal.burger.getBasePrice());
        System.out.println("Total Price: " + (deluxeBurgerMeal.burger.additionalComponentsPrice() + deluxeBurgerMeal.burger.getBasePrice()));
    }
}