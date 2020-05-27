public class Item implements Comparable<Item> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedStock;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reservedStock = 0;
    }

    public Item(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableStock() {
        return quantityStock - reservedStock;
    }

    public int quantityInStock() {
        return quantityStock;
    }


    public int quantityReserved() {
        return reservedStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >=0) {
            this.quantityStock = newQuantity;
        }
    }

    public void adjustReservedStock(int reservedStock) {
        int newReservedStock = this.reservedStock + reservedStock;
        if(newReservedStock >= 0) {
            this.reservedStock = newReservedStock;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((Item) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(Item o) {
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
