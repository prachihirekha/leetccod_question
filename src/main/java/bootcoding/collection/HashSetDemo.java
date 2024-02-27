package bootcoding.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // insertion order is not preserved and duplicated are not allow

        HashSet h = new HashSet();
        h.add("java");
        h.add("is");
        h.add("a");
        h.add("programming");
        h.add(null);
        h.add(1);
        System.out.println(h.add("java"));
        System.out.println(h);
    }
}
