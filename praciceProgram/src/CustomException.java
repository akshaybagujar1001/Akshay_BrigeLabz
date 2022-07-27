package com.practiceProgram.java;
import java.util.Scanner;
public class CustomException {

    public static void main(String[] args) throws validAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age : ");
        int age = sc.nextInt();
        try {
            if (age < 18){
                throw new validAgeException("Your Are Not Eligible For Voting ");
            }else {
                System.out.println("You are Eligible");
            }
        }
        catch (validAgeException e){
            e.printStackTrace();
        }
    }
}
class validAgeException extends RuntimeException{
    public validAgeException(String msg) {
        super(msg);
    }
}

