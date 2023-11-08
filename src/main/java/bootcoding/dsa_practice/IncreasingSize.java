package bootcoding.dsa_practice;

import java.util.ArrayList;

public class IncreasingSize {
    public static void main(String[] args) {
        ArrayList<String>arrayList= new ArrayList<>();
        arrayList.add("red");
        arrayList.add("pink");
        arrayList.add("blue");
        System.out.println(arrayList);
        arrayList.ensureCapacity(4);
        arrayList.add("yellow");
        arrayList.add("radikha");
        arrayList.add("pallavi");
        System.out.println(arrayList);
    }
}
