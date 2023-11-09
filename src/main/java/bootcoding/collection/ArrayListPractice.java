package bootcoding.collection;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(34);
        array.add(60);
        System.out.println(array);
        // get by index
        System.out.println(array.get(2));
        array.add(0,20);
        System.out.println(array);
        array.toString();
        System.out.println(array);
        // remove
        array.remove(0);
        System.out.println(array);
        System.out.println(array.contains(1));
        System.out.println(array.contains(60));
       // is empty
        System.out.println(array.isEmpty());
    }

}
