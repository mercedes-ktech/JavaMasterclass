import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contactList.add(contact);
    }

    public void updateContact(String currentName, String newName, String newPhone) {
        int position = findName(currentName);
        contactList.set(position, new Contact(newName, newPhone));
    }

    public void removeContact(String nameToRemove) {
        contactList.remove(findName(nameToRemove));
    }

    public boolean findContact(String nameToFind) {
        return findName(nameToFind) >= 0;
    }

    private int findName(String nameToFind) {
        for(Contact contact : contactList){
            if(contact.getName() != null && contact.getName().contains(nameToFind))
                return contactList.indexOf(contact);
        }
        return -1;
    }

    public void printContactList() {
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i).toString());
        }
    }
}
