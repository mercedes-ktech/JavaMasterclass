import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthyBurgerTest {

    @Test
    public void shouldReturnHealthyBurgerBasePrice() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{};
        HealthyBurger healthyBurger = new HealthyBurger(additionalComponents);

        assertEquals(6, healthyBurger.getBasePrice());
    }

    @Test
    public void shouldHaveMaximumSixAdditionalComponents() {
        BurgerComponent[] additionalComponents = new BurgerComponent[]{
                new BurgerComponent("tomato", 0.5),
                new BurgerComponent("lettuce", 0.5),
                new BurgerComponent("onions", 0.5),
                new BurgerComponent("mayo", 0.5),
                new BurgerComponent("mustard", 0.5),
                new BurgerComponent("pepper", 0.5),
                new BurgerComponent("corn", 0.5)
        };
        HealthyBurger healthyBurger = new HealthyBurger(additionalComponents);

        assertEquals(-1, healthyBurger.additionalComponents());
    }
}
