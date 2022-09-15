package day9assignment.addressbok;



import java.util.*;

public class AddressBook extends Contact {
    String address, city, state;
    int zip;
    long phoneNo;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public void showContact(AddressBook contact) {

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

    public void editContact(AddressBook[] contactArr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the First name for update Address : ");
        String editName = sc.nextLine();
        int flag = 1;
        for (int i = 0; i < contactArr.length; i++) {
            if (editName.equals(contactArr[i].getFirstName())) {
                System.out.print("\nEnter your new Address : ");
                address = sc.nextLine();
                contactArr[i].setAddress(address);
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.print("\ncouldn't find the contact..");
        }
        sc.close();
    }

    public void deleteContact(AddressBook[] contactArr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the First name for delete : ");
        String editName = sc.nextLine();
        int flag = 1;
        for (int i = 0; i < contactArr.length; i++) {
            if (editName.equals(contactArr[i].getFirstName())) {
                AddressBook detail = new AddressBook();
                contactArr[i] = detail;
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
}