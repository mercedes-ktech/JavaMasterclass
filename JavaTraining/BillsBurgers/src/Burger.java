public class Burger {

    protected BurgerComponent[] baseComponents;
    protected BurgerComponent[] additionalComponents;

    protected double basePrice;

    public Burger() {
        this.basePrice = 5;
        this.baseComponents = new BurgerComponent[]{
                new BurgerComponent("bread"),
                new BurgerComponent("meat")};
        this.additionalComponents = new BurgerComponent[]{};
    }

    public Burger(BurgerComponent[] additionalComponents) {

        this.additionalComponents = additionalComponents;
        this.basePrice = 5;
        this.baseComponents = new BurgerComponent[]{
                new BurgerComponent("bread"),
                new BurgerComponent("meat")};
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double additionalComponentsPrice() {

        double totalPrice = 0;

        for (int i = 0; i < additionalComponents.length; i++) {
            totalPrice = totalPrice + additionalComponents[i].price();
        }
        return totalPrice;
    }

    public int additionalComponents() {

        int totalAdditionalComponents = 0;

        for(int i = 0; i < additionalComponents.length; i++) {
            totalAdditionalComponents++;
        }

        if(totalAdditionalComponents <= 4) {
            return  totalAdditionalComponents;
        } else {
            System.out.println("Maximum 4 add-ons");
            return  -1;
        }
    }
}