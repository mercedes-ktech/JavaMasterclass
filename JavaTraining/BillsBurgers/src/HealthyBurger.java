public class HealthyBurger extends Burger {

    public HealthyBurger(BurgerComponent[] additionalComponents) {
        super(additionalComponents);
        basePrice = 6;
        this.additionalComponents = additionalComponents;
        this.baseComponents = new BurgerComponent[]{
                new BurgerComponent("wholemeal bread"),
                new BurgerComponent("meat")};
    }

    @Override
    public int additionalComponents() {

        int totalAdditionalComponents = 0;

        for(int i = 0; i < additionalComponents.length; i++) {
            totalAdditionalComponents++;
        }

        if(totalAdditionalComponents <= 6) {
            return  totalAdditionalComponents;
        } else {
            System.out.println("Maximum 6 add-ons");
            return  -1;
        }
    }
}