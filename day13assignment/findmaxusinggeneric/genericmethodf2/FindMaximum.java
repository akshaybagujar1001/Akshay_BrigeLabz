package day13assignment.findmaxusinggeneric.genericmethodf2;



public class FindMaximum<T extends Comparable<T>> {

    T input1, input2, input3;

    // contructor
    FindMaximum(T input1, T input2, T input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public T testMaximum() {
        return FindMaximum.testMaximum(input1, input2, input3);
    }

    public static <T extends Comparable<T>> T testMaximum(T input1, T input2, T input3) {

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

        Integer intValue1 = 300, intValue2 = 500, intValue3 = 960;
        Float floatValue1 = 3.3f, floatValue2 = 3.5f, floatValue3 = 8.7f;
        String stringValue1 = "Mango", stringValue2 = "Orange", stringValue3 = "PineApple";

        new FindMaximum(intValue1, intValue2, intValue3).testMaximum();
        new FindMaximum(floatValue1, floatValue2, floatValue3).testMaximum();
        new FindMaximum(stringValue1, stringValue2, stringValue3).testMaximum();
    }
}