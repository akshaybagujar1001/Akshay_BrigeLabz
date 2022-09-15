package day10assignment.addressbook;



import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class OperateContact {
    HashMap<String, AddressBook> contactMap = new HashMap<>();

    public void editContact() {

        String address;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the First name for update Address : ");
        String editName = sc.nextLine();
        int flag = 1;
        for (String firstName : contactMap.keySet()) {
            AddressBook contact = contactMap.get(firstName);

            if (editName.equals(contact.getFirstName())) {
                System.out.print("\nEnter your new Address : ");
                address = sc.nextLine();
                contact.setAddress(address);
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.print("\ncouldn't find the contact..");
        } else {
            System.out.print("\nYour contact updated.");
        }
    }

    public void deleteContact() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the First name for delete : ");
        String deleteName = sc.nextLine();
        int flag = 1;
        for (String firstName : contactMap.keySet()) {
            AddressBook contact = contactMap.get(firstName);
            if (deleteName.equals(contact.getFirstName())) {
                contactMap.remove(firstName);
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.print("\ncouldn't find the contact..");
        } else {
            System.out.print("\nYour contact deleted..");
        }
        sc.close();
    }

    public void showContact() {

        for (String firstName : contactMap.keySet()) {
            AddressBook contact = contactMap.get(firstName);

            System.out.print("\n-----------------");
            System.out.print("\nFirst Name  : " + contact.getFirstName());
            System.out.print("\nLast Name   : " + contact.getLastName());
            System.out.print("\nAddress     : " + contact.getAddress());
            System.out.print("\nCity        : " + contact.getCity());
            System.out.print("\nState       : " + contact.getState());
            System.out.print("\nPone Number : " + contact.getPhoneNo());
            System.out.print("\nE-mail      : " + contact.getEmail());
            System.out.print("\nZip         : " + contact.getZip());
        }
    }

    public void storeContact(String firstName, AddressBook contact) {

        this.contactMap.put(firstName, contact);
    }
}