package day16_17assignment.algorithmprograms;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2) {
        // Get lenghts of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same then they cannot be anagram
        if (n1 != n2)
            return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st strings: ");
        String str1 = input.next();
        System.out.println("Enter 2nd strings: ");
        String str2 = input.next();

        if (checkAnagram(str1, str2))
            System.out.println("The two strings are Anagram ");
        else
            System.out.println("The two strings are Not anagram ");
    }
}