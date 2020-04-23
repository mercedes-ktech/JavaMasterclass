public class DeluxeBurger extends Burger {

    boolean drink;
    double drinkPrice = 1.50;
    boolean chips;
    double chipsPrice = 1.50;

    public DeluxeBurger(String name, String breadType, double burgerPrice) {
        super(name, breadType, burgerPrice);
        this.chips = true;
        this.drink = true;
        lettuce = false;
        cheese = false;
        onions = false;
        tomato = false;
    }

    @Override
    public int totalAdditions() {
        int totalAdditions = super.totalAdditions();
        totalAdditions += drink ? 1 : 0;
        totalAdditions += chips ? 1 : 0;

        return totalAdditions;
    }

    @Override
    public double totalPrice() {
        double totalPrice = super.totalPrice();

        totalPrice += drink ? drinkPrice : 0;
        totalPrice += chips ? chipsPrice : 0;

        return totalPrice;
    }

    @Override
    public void receiptBreakDown() {

        super.receiptBreakDown();

        if(drink) {
            System.out.println("Drink price: " + drinkPrice);
        }
        if(chips){
            System.out.println("Chips price: " + chipsPrice);
        }

    }

    @Override
    public void setTomato(boolean tomato) {
        System.out.println("NO TOMATO");
    }
}

