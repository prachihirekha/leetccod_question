package bootcoding.collection.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverse {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(20);
        list.add(45);
        list.add(345);
        list.add(23);
       Iterator<Integer> integers=list.descendingIterator();
       while(integers.hasNext()){
           System.out.println(integers.next());
       }
    }

}

