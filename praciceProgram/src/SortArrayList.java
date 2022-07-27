import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String args[]) {
//creating an object of ArrayList class
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(54);
        list.add(34);
        list.add(98);
        list.add(67);
        list.add(45);
        list.add(87);
        list.add(81);

        System.out.println("ArrayList Before Sorting:");
        for (int sort : list) {
            System.out.println(sort + " ");
        }

        Collections.sort(list);

        System.out.println("ArrayList After Sorting:");
        for (int sorts : list) {
            System.out.println(sorts + " ");
        }
    }
}

