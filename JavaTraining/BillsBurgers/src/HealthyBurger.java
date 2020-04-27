public class HealthyBurger extends Burger {

    boolean peppers;
    boolean carrots;
    double peppersPrice = 0.50;
    double carrotsPrice = 0.50;

    public HealthyBurger(String name, int burgerPrice) {
        super(name, burgerPrice);
        this.breadType = "brown roll";
    }

    public void setPeppers(boolean peppers) {
        this.peppers = peppers;

    }

    public void setCarrots(boolean carrots) {
        this.carrots = carrots;

    }

    @Override
    public int totalAdditions() {

        int totalAdditions = super.totalAdditions();
        totalAdditions += peppers ? 1 : 0;
        totalAdditions += carrots ? 1 : 0;

        return totalAdditions;

    }

    @Override
    public double totalPrice() {

        double totalPrice = super.totalPrice();
        totalPrice += peppers ? peppersPrice : 0;
        totalPrice += carrots ? carrotsPrice : 0;

        return totalPrice;
    }

    @Override
    public void receiptBreakDown() {

        super.receiptBreakDown();

        if(peppers) {
            System.out.println("Peppers price: " + peppersPrice);
        }
        if(carrots){
            System.out.println("Carrots price: " + carrotsPrice);
        }

    }
}

