package bootcoding.leetcodeque.hackerrank;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int i= scan.nextInt();
       // System.out.println(" enter the double number");
        double d =scan.nextDouble();
        scan.nextLine();
        String s =scan.nextLine();
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
