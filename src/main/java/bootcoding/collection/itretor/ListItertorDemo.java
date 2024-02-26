package bootcoding.collection.itretor;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListItertorDemo {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList<>();
        ls.add("java");
        ls.add("moye");
        ls.add("python");
        ls.add("php");
        ls.add("html");
        ls.add("css");
        System.out.println(ls);

        ListIterator ltr = ls.listIterator();
        while (ltr.hasNext()){
            String s =(String) ltr.next();
            if (s.equals("moye")){
                ltr.remove();
            }else if (s.equals("python")){
                ltr.add("is");
            } else if (s.equals("php")) {
                ltr.set("programming");
            }
        }
        System.out.println(ls);

    }
}
