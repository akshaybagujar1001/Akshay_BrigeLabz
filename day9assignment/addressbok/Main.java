package day9assignment.addressbok;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        String firstName, lastName, address, city, state, email;
        int zip;
        long phoneNo;
        // array to store object of type AddressBook
        AddressBook[] contactArr = new AddressBook[2];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < contactArr.length; i++) {

            // create new object in each iteration
            AddressBook contact = new AddressBook();

            System.out.print("\nEnter First Name  : ");
            firstName = sc.nextLine();
            contact.setFirstName(firstName);

            System.out.print("\nEnter Last Name  : ");
            lastName = sc.nextLine();
            contact.setLastName(lastName);

            System.out.print("\nEnter E-mail  : ");
            email = sc.nextLine();
            contact.setEmail(email);

            System.out.print("\nEnter Address  : ");
            address = sc.nextLine();
            contact.setAddress(address);

            System.out.print("\nEnter City  : ");
            city = sc.nextLine();
            contact.setCity(city);

            System.out.print("\nEnter State  : ");
            state = sc.nextLine();
            contact.setState(state);

            System.out.print("\nEnter Phone Number  : ");
            phoneNo = sc.nextLong();
            contact.setPhoneNo(phoneNo);

            System.out.print("\nEnter Zip  : ");
            zip = sc.nextInt();
            contact.setZip(zip);

            sc.nextLine();

            contactArr[i] = contact;
        }
        System.out.print("\nDo you want to edit? press Y / N : ");
        char editOption = sc.next().charAt(0);
        AddressBook person = new AddressBook();
        if (editOption == 'Y') {
            person.editContact(contactArr);
        }
        for (int i = 0; i < contactArr.length; i++) {

            contactArr[i].showContact(contactArr[i]);
        }
        sc.nextLine();
        System.out.print("\nDo you want to delete? press Y / N : ");
        char deleteOption = sc.next().charAt(0);
        if (deleteOption == 'Y') {
            person.deleteContact(contactArr);
        }

        for (int i = 0; i < contactArr.length; i++) {

            contactArr[i].showContact(contactArr[i]);
        }
        sc.close();
        System.out.println("Welcome In Adress Book Program On Master Branch");
    }
}