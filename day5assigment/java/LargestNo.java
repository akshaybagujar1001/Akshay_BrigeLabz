package com.day5assigment.java;

public class LargestNo {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 24;
        int n3 = 65;
        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
