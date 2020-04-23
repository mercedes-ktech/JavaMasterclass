public class VipCustomer {


    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 100, "Default email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


    public static void main(String[] args) {

        VipCustomer customer1 = new VipCustomer();
        System.out.println("Empty constructor : " + customer1.getName() + ", " + customer1.getCreditLimit() + ", " + customer1.getEmail());

        VipCustomer customer2 = new VipCustomer("Mer", 1000000);
        System.out.println("Constructor with last field as default: " + customer2.getName() + ", " + customer2.getCreditLimit() + ", " + customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("Abel", 10000005, "abel@abel.com");
        System.out.println("No default fields: " + customer3.getName() + ", " + customer3.getCreditLimit() + ", " + customer3.getEmail());
    }

}
