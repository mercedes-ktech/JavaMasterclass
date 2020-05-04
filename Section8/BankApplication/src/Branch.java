/*Branch:
Need to be able to add a new customer and initial transaction amount.
Also needs to add additional transactions for that customer/branch
 */

import java.util.ArrayList;
import java.util.Collection;

public class Branch {

    String branchName;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public void addNewCustomer(String customerName, Double initialTransaction) {
        ArrayList<Double> transactions = new ArrayList<Double>();
        transactions.add(initialTransaction);
        Customer customer = new Customer(customerName, transactions);
        customerList.add(customer);
    }

    public void addCustomer(String customerName) {
        ArrayList<Double> transactions = new ArrayList<Double>();
        Customer customer = new Customer(customerName);
        customerList.add(customer);
    }

    public void addTransactionToCustomer(String customerName, Double transaction) {
//        int index = findCustomer(customerName); //find customer index
//        Customer customer = customerList.get(index); // get customer
//        ArrayList<Double> transactionList = customer.getTransactionList();//get transactions
//        transactionList.add(transaction); //add transaction to list
        customerList.get(findCustomer(customerName)).getTransactionList().add(transaction);
    }

    public int findCustomer(String nameToFind) {
        for(Customer customer : customerList){
            if(customer.getName() != null && customer.getName().contains(nameToFind))
                return customerList.indexOf(customer);
        }
        return -1;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
}
