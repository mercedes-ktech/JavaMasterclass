/* Your job is to create a simple banking application.
There should be a Bank class
It should have an arraylist of Branches
Each Branch should have an arraylist of Customers
The Customer class should have an arraylist of Doubles (transactions)

Customer:
Name, and the ArrayList of doubles.

Branch:
Need to be able to add a new customer and initial transaction amount.
Also needs to add additional transactions for that customer/branch

Bank:
Add a new branch
Add a customer to that branch with initial transaction
Add a transaction for an existing customer for that branch
Show a list of customers for a particular branch and optionally a list
of their transactions

Demonstration autoboxing and unboxing in your code
Hint: Transactions
Add data validation.
e.g. check if exists, or does not exist, etc.
Think about where you are adding the code to perform certain actions
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Branch> branchList = new ArrayList<>();

    public void addBranch(String branchName) {
        Branch branch = new Branch(branchName);
        branchList.add(branch);
    }

    public void addCustomerToBranch(String branchName, String customerName) {
        int index = findBranch(branchName);
        Branch branch = branchList.get(index); //find branch index
        branch.getCustomerList();//get customer list for that branch
        branch.addCustomer(customerName);//add Customer to list

        branchList.get(findBranch(branchName)).addCustomer(customerName);

    }

    public int findBranch(String branchName) {
        for (Branch branch : branchList) {
            if (branch.getBranchName() != null && branch.getBranchName().contains(branchName))
                return branchList.indexOf(branch);
        }
        return -1;
    }

    public void addTransaction(String branchName, String customerName, Double transaction) {
        int indexBranch = findBranch(branchName);
        Branch branch = branchList.get(indexBranch);
        branch.addTransactionToCustomer(customerName, transaction);
    }

    public void customerTransactions(String branchName, String customerName) {
        int indexBranch = findBranch(branchName);
        Branch branch = branchList.get(indexBranch);
        ArrayList<Customer> customerList = branch.getCustomerList();
        int indexCustomer = branch.findCustomer(customerName); //find customer index
        Customer customer = customerList.get(indexCustomer);
        customer.printCustomerTransactions();
    }
}

