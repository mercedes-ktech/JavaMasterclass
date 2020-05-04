import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        while(!quit) {
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    createBranch();
                    break;
                case 1:
                    addCustomerToBranch();
                    break;
                case 2:
                    addTransactionToCustomer();
                    break;
                case 3:
                    customerTransactions();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    public static void createBranch() {
        System.out.println("Create a new branch: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    public static void addCustomerToBranch() {
        System.out.println("Add a customer to a branch");
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        bank.addCustomerToBranch(branchName, customerName);
    }

    public static void addTransactionToCustomer() {
        System.out.println("New transaction");
        System.out.println("Enter branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter amount:");
        Double amount = scanner.nextDouble();
        bank.addTransaction(branchName, customerName, amount);
    }

    public static void customerTransactions() {
        System.out.println("Show customer transactions");
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter branch name:");
        String branchName = scanner.nextLine();
        bank.customerTransactions(branchName, customerName);
    }
}
