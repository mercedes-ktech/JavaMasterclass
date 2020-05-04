public class BurgerComponent {

    private String componentName;
    private double price;

    public BurgerComponent(String componentName, double price) {
        this.componentName = componentName;
        this.price = price;
    }

    public BurgerComponent(String componentName){
        this.componentName = componentName;
        this.price = 0;
    }

    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return componentName.substring(0, 1).toUpperCase() + componentName.substring(1).toLowerCase();
    }
}