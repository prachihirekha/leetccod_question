package bootcoding.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls= new LinkedHashSet<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(null);
        ls.add(6);
        System.out.println(ls.add(1));
        System.out.println(ls);
    }
}
