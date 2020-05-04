/*The Customer class should have an arraylist of Doubles (transactions)
Customer:
Name, and the ArrayList of doubles.
 */
import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactionList = new ArrayList<Double>();

    public Customer(String name, ArrayList<Double> transactionList) {
        this.name = name;
        this.transactionList = transactionList;
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Double> transactionList) {
        this.transactionList = transactionList;
    }

    public void addTransaction(Double transaction) {
        transactionList.add(transaction);
    }

    public void printCustomerTransactions() {
        for(int i = 0; i < transactionList.size(); i++) {
            System.out.println(transactionList.get(i).toString());
        }
    }
}
