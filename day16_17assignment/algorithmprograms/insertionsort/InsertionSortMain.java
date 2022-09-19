package day16_17assignment.algorithmprograms.insertionsort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<String> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        //call the insertion sort method
        InsertionSortImplementation insertionSort = new InsertionSortImplementation(array);
        insertionSort.sort();
    }
}