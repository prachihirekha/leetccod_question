package bootcoding.leetcodeque.hackerrank;

import java.util.Scanner;

public class IFAndElse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();
        if((n%2!=0)||(n>=6 &&n<=20)){
            System.out.println("weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
}
