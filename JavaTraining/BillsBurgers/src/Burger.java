public class Burger {

    protected String name;
    protected double burgerPrice;
    protected String breadType;
    protected boolean meat;
    protected boolean lettuce;
    protected double lettucePrice = 0.60;
    protected boolean cheese;
    protected double cheesePrice = 1;
    protected boolean onions;
    protected double onionsPrice = 0.60;
    protected boolean tomato;
    protected double tomatoPrice = 0.75;

    public Burger(String name, String breadType, double burgerPrice) {
        this.name = name;
        this.breadType = breadType;
        this.burgerPrice = burgerPrice;
        this.meat = true;
    }

    public Burger(String name, int burgerPrice) {
        this.name = name;
        this.burgerPrice = burgerPrice;
        this.meat = true;

    }
    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setOnions(boolean onions) {
        this.onions = onions;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;

    }

    public String getBreadType() {
        return breadType;
    }

    public String getName() {
        return name;
    }

    public int totalAdditions() {

        int totalAdditions = 0;

        totalAdditions += tomato ? 1 : 0;
        totalAdditions += lettuce ? 1 : 0;
        totalAdditions += cheese ? 1 : 0;
        totalAdditions += onions ? 1 : 0;

        return totalAdditions;
    }

    public double totalPrice() {

        double totalPrice = burgerPrice;

        totalPrice += tomato ? tomatoPrice : 0;
        totalPrice += lettuce ? lettucePrice : 0;
        totalPrice += cheese ? cheesePrice : 0;
        totalPrice += onions ? onionsPrice : 0;

        return totalPrice;

    }

    public void receiptBreakDown() {

        System.out.println("Burger base price: " + burgerPrice);

        if(tomato) {
            System.out.println("Tomato price: " + tomatoPrice);
        }
        if(lettuce){
            System.out.println("Lettuce price: " + lettucePrice);
        }
        if(cheese) {
            System.out.println("Cheese price: " + cheesePrice);
        }
        if(onions) {
            System.out.println("Onions price: " + onionsPrice);
        }

    }


    public void receiptTotals() {

        System.out.println("Total additions: " + totalAdditions());
        System.out.println("Total price: " + totalPrice());

    }

    public void receipt() {
        receiptBreakDown();
        receiptTotals();
    }

}
