package day16_17assignment.algorithmprograms;

import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound of the interval: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter upper bound of the interval: ");
        int upperBound = sc.nextInt();

        System.out.println("Prime numbers between " +lowerBound + " and " +upperBound+ " are: ");
        checkPrime(lowerBound, upperBound);
    }

    public static void checkPrime(int lowerBound, int upperBound) {
        int flag = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
                arrayList.add(Integer.toString(i));
            }
        }
        System.out.println();
        printAnagrams(arrayList);
        checkPalindromePair(arrayList);
    }

    private static void printAnagrams(ArrayList<String> arr) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            String word = arr.get(i);
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // calculate hashcode of string  after sorting
            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            }
            else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        System.out.println("Anagrams are: ");
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
        System.out.println();
    }

    private static boolean isPalindrome(String str) {
        int len = str.length();
        // compare each character from 1st with its corresponding character from last
        for (int i = 0; i < len/2; i++ )
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;
        return true;
    }

    private static boolean checkPalindromePair(List<String> array) {
        boolean flag = false;
        System.out.println("\n" + "Palindrome numbers");
        for (int i = 0; i < array.size()-1; i++) {
            if (isPalindrome(array.get(i))) {
                System.out.print(array.get(i) + " ");
                flag = true;
            }
        }
        return flag;
    }
}