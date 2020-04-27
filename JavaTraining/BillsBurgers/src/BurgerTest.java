import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BurgerTest {

    @Test
    public void shouldReturnBurgerBasePrice() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{};
        Burger burger = new Burger(additionalComponents);

        assertEquals(5, burger.getBasePrice());
    }

    @Test
    public void shouldReturnBurgerWithAdditionalComponentsPrice() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{new BurgerComponent("tomato", 0.5)};
        Burger burger = new Burger(additionalComponents);

        assertEquals(5.5, burger.getBasePrice() + burger.additionalComponentsPrice());
    }

    @Test
    public void shouldReturnTotalAdditionalComponents() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{
                new BurgerComponent("tomato", 0.5),
                new BurgerComponent("lettuce", 0.5),
                new BurgerComponent("onions", 0.5),
                new BurgerComponent("mayo", 0.5),
        };
        Burger burger = new Burger(additionalComponents);

        assertEquals(4, burger.additionalComponents());
    }

    @Test
    public void shouldHaveMaximumFourAdditionalComponents() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{
                new BurgerComponent("tomato", 0.5),
                new BurgerComponent("lettuce", 0.5),
                new BurgerComponent("onions", 0.5),
                new BurgerComponent("mayo", 0.5),
                new BurgerComponent("mustard", 0.5)
        };
        Burger burger = new Burger(additionalComponents);

        assertEquals(-1, burger.additionalComponents(), "Maximum 4 add-ons");
    }
}