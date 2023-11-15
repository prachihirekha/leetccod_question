package bootcoding.basic.question;

public class Swap {
    public static void main(String[] args) {
        int x =23;
        int y=39;
        System.out.println("before swapping the element "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping th element"+x+" "+y);
    }
}
