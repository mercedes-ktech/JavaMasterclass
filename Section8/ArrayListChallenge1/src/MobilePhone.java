import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static ContactList contactList = new ContactList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printOptions();

        while (!quit) {
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void printOptions() { //if not static, the method needs an instance of class MobilePhone to work
        System.out.println("Select an option: ");
        System.out.println("\t 0 - Options menu");
        System.out.println("\t 1 - Access contact list");
        System.out.println("\t 2 - Add a new contact");
        System.out.println("\t 3 - Update an existing contact");
        System.out.println("\t 4 - Delete contact");
        System.out.println("\t 5 - Find contact");
        System.out.println("\t 6 - Quit");
    }

    public static void addContact() {
        System.out.print("Please enter the contact name: ");
        String contactName = scanner.nextLine();
        System.out.print("Please enter the contact number: ");
        String contactNumber = scanner.nextLine();
        contactList.addContact(contactName, contactNumber);
    }

    public static void updateContact() {
        System.out.print("Please enter the contact name to update: ");
        String currentName = scanner.nextLine();


        System.out.print("Please enter the new contact name: ");
        String newName = scanner.nextLine();

        System.out.print("Please enter the new contact number: ");
        String newNumber = scanner.nextLine();

        contactList.updateContact(currentName, newName, newNumber);
    }

    public static void removeContact() {
        System.out.print("Please enter the name of the contact to be removed: ");
        String contactToRemove = scanner.nextLine();

        contactList.removeContact(contactToRemove);
        System.out.println(contactToRemove + " has been removed from the contact list");
    }

    public static void findContact() {
        System.out.print("Contact name to search for: ");
        String contactName = scanner.nextLine();

        if(contactList.findContact(contactName)) {
            System.out.println("Found " + contactName + " in the contact list");
        } else {
            System.out.println(contactName + " is not in the contact list");
        }
    }
}