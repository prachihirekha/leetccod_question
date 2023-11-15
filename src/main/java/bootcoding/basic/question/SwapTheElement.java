package bootcoding.basic.question;

import java.util.Scanner;

public class SwapTheElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the amount of  and y");
        int x =sc.nextInt();
        int y =sc.nextInt();
        System.out.println("before swapping"+x+" "+ y);
        // swapping
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping" +x +" "+y);

    }
}
