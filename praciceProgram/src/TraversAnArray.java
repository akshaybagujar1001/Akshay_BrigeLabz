package com.practiceProgram.java;
public class TraversAnArray {
    public static void main(String args[]) {

        int arr[] = new int[6];

        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 16;

        System.out.println("Element of Arrays : ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}