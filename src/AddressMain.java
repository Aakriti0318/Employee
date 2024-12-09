import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1-> {
                    System.out.print("Enter first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    addressBook.addContact(new Contact(firstName, lastName, address, phoneNumber, email));
                    System.out.println("Contact added successfully!");
                }

                case 2-> {
                    System.out.print("Enter the first name of the contact to edit: ");
                    String editName = sc.nextLine();
                    if (addressBook.editContact(editName)) {
                        System.out.println("Contact updated successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                }

                case 3-> {
                    System.out.print("Enter the first name of the contact to delete: ");
                    String deleteName = sc.nextLine();
                    if (addressBook.deleteContact(deleteName)) {
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                }

                case 4-> {
                    addressBook.displayContacts();
                }

                case 5-> {
                    System.out.println("...............Exit............Goodbye!");
                    sc.close();
                    return;
                }
                default->
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}