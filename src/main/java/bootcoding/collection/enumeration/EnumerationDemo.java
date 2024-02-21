package bootcoding.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            // type casting
            Integer I =(Integer) e.nextElement();
            if(I%2==0){
                System.out.println(I);
            }

        }
        System.out.println(v);

    }
}
