package day13assignment.findmaxusinggeneric.genericmethodf1;



public class FindMaximum {

    public static <T extends Comparable<T>> T getMax(T input1, T input2, T input3) {

        // assume input1 is max
        T maxValue = input1;
        if (input2.compareTo(maxValue) > 0) {
            maxValue = input2;
        }
        if (input3.compareTo(maxValue) > 0) {
            maxValue = input3;
        }

        showMaxValue(input1, input2, input3, maxValue);
        return maxValue;
    }

    public static <T> void showMaxValue(T input1, T input2, T input3, T maxValue) {

        System.out.println("\nNumber1 : " + input1 + "\nNumber2 : " + input2 + "\nNumber3 : " + input3);
        System.out.println("Maximum : " + maxValue);
    }

    public static void main(String[] args) {

        Integer intValue1 = 800, intValue2 = 100, intValue3 = 950;
        Float floatValue1 = 6.3f, floatValue2 = 11.3f, floatValue3 = 14.7f;
        String stringValue1 = "Mango", stringValue2 = "Orange", stringValue3 = "PineApple";

        getMax(intValue1, intValue2, intValue3);
        getMax(floatValue1, floatValue2, floatValue3);
        getMax(stringValue1, stringValue2, stringValue3);
    }
}