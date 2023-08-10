package bootcoding.leetcodeque.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your message");
        String s =scan.next();
        int i =scan.nextInt();
        System.out.printf("%-15s%03d\n",s,i);


    }
}
