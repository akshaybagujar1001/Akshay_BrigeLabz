package day13assignment.findmaxusinggeneric.uc3stringmaximum;



public class FindMaximum implements MaxOperation {

    public static void main(String[] args) {
        FindMaximum find = new FindMaximum();
        Integer intObj1 = Integer.valueOf("800");
        Integer intObj2 = Integer.valueOf("557");
        Integer intObj3 = Integer.valueOf("500");
        int maxIntValue = find.findMaxInt(intObj1, intObj2, intObj3);
        System.out.println("Integer Maximum : " + maxIntValue);

        Float floatObj1 = Float.valueOf("7.2");
        Float floatObj2 = Float.valueOf("10.2");
        Float floatObj3 = Float.valueOf("6.4");
        float maxFloatValue = find.findMaxFloat(floatObj1, floatObj2, floatObj3);
        System.out.println("Float Maximum : " + maxFloatValue);

        String stringObj1 = String.valueOf("Apple");
        String stringObj2 = String.valueOf("Pineapple");
        String stringObj3 = String.valueOf("Orange");
        String maxStringValue = find.findMaxString(stringObj1, stringObj2, stringObj3);
        System.out.println("String Maximum : " + maxStringValue);
    }

    public int findMaxInt(Integer intObj1, Integer intObj2, Integer intObj3) {

        int maxIntValue;
        int result1 = intObj1.compareTo(intObj2);
        int result2 = intObj1.compareTo(intObj3);
        int result3 = intObj2.compareTo(intObj3);
        if (result1 > 0 && result2 > 0) {
            maxIntValue = intObj1;
        } else if (result3 > 0 && result1 < 0) {
            maxIntValue = intObj2;
        } else {
            maxIntValue = intObj3;
        }
        return maxIntValue;
    }

    public float findMaxFloat(Float floatObj1, Float floatObj2, Float floatObj3) {

        float maxFloatValue;
        float result1 = Float.compare(floatObj1, floatObj2);
        float result2 = Float.compare(floatObj1, floatObj3);
        float result3 = Float.compare(floatObj2, floatObj3);
        if (result1 > 0 && result2 > 0) {
            maxFloatValue = floatObj1;
        } else if (result3 > 0 && result1 < 0) {
            maxFloatValue = floatObj2;
        } else {
            maxFloatValue = floatObj3;
        }
        return (float) maxFloatValue;
    }

    public String findMaxString(String stringObj1, String stringObj2, String stringObj3) {

        String maxStringValue;
        int result1 = stringObj1.compareTo(stringObj2);
        int result2 = stringObj1.compareTo(stringObj3);
        int result3 = stringObj2.compareTo(stringObj3);
        if (result1 > 0 && result2 > 0) {
            maxStringValue = stringObj1;
        } else if (result3 > 0 && result1 < 0) {
            maxStringValue = stringObj2;
        } else {
            maxStringValue = stringObj3;
        }
        return maxStringValue;
    }
}