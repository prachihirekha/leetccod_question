package bootcoding.dsa_practice;

import java.util.ArrayList;

public class Trimming {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(80);

        System.out.println(arr);
        System.out.println("before and after");
         arr.trimToSize();
        System.out.println(arr);

    }
}
