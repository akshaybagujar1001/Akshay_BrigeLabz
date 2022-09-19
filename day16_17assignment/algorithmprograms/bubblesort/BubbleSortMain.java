package day16_17assignment.algorithmprograms.bubblesort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<Integer> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        Integer[] array = new Integer[dataArray.size()];
        array = dataArray.toArray(array);

        //call the bubble sort method
        BubbleSortImplementation bubbleSort = new BubbleSortImplementation(array);
        bubbleSort.sort();
    }
}