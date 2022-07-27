package com.practiceProgram.java;
import java.util.ArrayList;
import java.util.List;
public class CompareTwoArrayList {

    public static void main(String args[])
    {
        ArrayList<String> name1 =new ArrayList<String>();

        name1.add("Rahul");
        name1.add("Avinash");
        name1.add("Rajkumar");
        name1.add("Kumar");
        System.out.println(name1);

        List<String> name2=new ArrayList<String>();

        name2.add("Rahul");
        name2.add("Avinash");
        name2.add("Rajkumar");
        name2.add("Kumar");
        System.out.println(name2);

        boolean compare1 = name1.equals(name2);
        System.out.println(compare1);

        name2.add("Navin");
        System.out.println(name2);

        boolean compare2 = name1.equals(name2);
        System.out.println(compare2);
    }
}
