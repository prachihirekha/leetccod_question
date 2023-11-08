package bootcoding.dsa_practice;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(70);
        arrayList.add(20);
        System.out.println(arrayList);
       int a= arrayList.get(0);
        System.out.println(a);
    }
}
