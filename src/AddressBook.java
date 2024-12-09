import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    // Add contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    // Edit contact by name
    public boolean editContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new address: ");
                contact.setAddress(sc.nextLine());
                System.out.print("Enter new phone number: ");
                contact.setPhoneNumber(sc.nextLine());
                System.out.print("Enter new email: ");
                contact.setEmail(sc.nextLine());
                return true;
            }
        }
        return false;
    }
    // Delete contact by name
    public boolean deleteContact(String name) {
        return contacts.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(name));
    }
    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }

    }}