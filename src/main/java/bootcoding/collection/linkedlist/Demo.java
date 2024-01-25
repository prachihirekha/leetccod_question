package bootcoding.collection.linkedlist;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("Prachi");
        l1.add(1);
        l1.add("raju");
        l1.add(null);
        System.out.println(l1);
        l1.add(3,"sima");
        l1.add("prajwal");
        l1.set(2,5);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);

    }
}
