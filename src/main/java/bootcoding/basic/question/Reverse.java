package bootcoding.basic.question;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
       String str= sc.nextLine();
       sc.close();
        String reversed = reverseString(str);
        System.out.println(reversed);
    }
    public static String reverseString(String s) {
        if (s.isEmpty())
            return s;
        return reverseString(s.substring(1))+s.charAt(0);
    }
}

