public class DeluxeBurgerMeal {

    MealComponent[] mealComponents;
    Burger burger;

    public DeluxeBurgerMeal(Burger burger, MealComponent[] mealComponents) {
        this.burger = burger;
        burger.basePrice = 8;
        this.mealComponents = mealComponents;
    }
}