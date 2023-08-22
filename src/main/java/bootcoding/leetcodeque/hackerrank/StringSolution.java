package bootcoding.leetcodeque.hackerrank;

import java.util.Scanner;

public class StringSolution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mgs");
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i=A.compareTo(B);
        if(i<=0){
            System.out.println("No");
        }
        else {
            System.out.println("yes");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));


    }
}


//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        String B = sc.next();
//
//        // Print the sum of the lengths of A and B
//        System.out.println(A.length() + B.length());
//
//        // Determine if A is lexicographically larger than B
//        if (A.compareTo(B) > 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//
//        // Capitalize the first letter in A and B
//        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
//
//        sc.close();
//    }
//
//    private static String capitalizeFirstLetter(String s) {
//        if (s == null || s.isEmpty()) {
//            return s;
//        }
//        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
//    }
//}
//
