package day14assignment.learningproblam;



import java.util.Scanner;

public class LinkesListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure Program On LinkedList ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to add the data at the end");
        System.out.println("Enter 3 to insert data at the Middle");
        System.out.println("Enter 4 to delete data at the first");
        System.out.println("Enter 5 to delete data at the last");
        System.out.println("Enter 6 to find index number and node base on value");
        System.out.println("Enter 7 to add element at specific node in LinkedList");
        System.out.println("Enter 8 to delete node in between the LinkedList");
        System.out.println("Enter 9 to sort linked list");

        switch (scanner.nextInt()) {
            case 1:
                Operations.addeElementAtStart();
                break;
            case 2:
                Operations.addElementAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
            case 5:
                Operations.deleteLastNode();
                break;
            case 6:
                Operations.searchNodeBaseOnValue();
            case 7:
                Operations.insertAtGivenNode();
                break;
            case 8:
                Operations.deleteInBetweenNode();
                break;
            case 9:
                Operations.sortNode();
        }
    }
}