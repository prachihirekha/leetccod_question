package bootcoding.collection.itretor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class InternalWor {
    // for checking to internal work of enumeration, iterator, listIterator
    public static void main(String[] args) {
        Vector v = new Vector<>();
        Enumeration e = v.elements();
        Iterator r = v.iterator();
        ListIterator ls = v.listIterator();
        System.out.println(e.getClass().getName());
        System.out.println(r.getClass().getName());
        System.out.println(ls.getClass().getName());
    }
}
