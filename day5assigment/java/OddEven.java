package com.day5assigment.java;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        if(a % 2 ==0){
            System.out.println(" even number");
        }
else {
            System.out.println("odd number");
        }
    }
}
