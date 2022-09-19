package day16_17assignment.algorithmprograms.insertionsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> readFile() {
        ArrayList<String> dataArray = new ArrayList<>();
        String data = " ";
        String filePath = "D:\\AlgorithmProgram\\src\\InsertionSort\\data.txt";
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                //reading the line from the file and removing the "," from the line
                data = myReader.nextLine().replaceAll(",", data);
                //splitting the data into new line based on white space
                String[] data1 = data.split("\\W+");
                for(String s: data1)
                    dataArray.add(s);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return dataArray;
    }
}