package bootcoding.leetcodeque.hackerrank;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Reading input from wherever you get it
//        int month = 2;
//        int day = 7;
//        int year = 2000;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  your birthday date");
        int day =sc.nextInt();
        int month= sc.nextInt();
        int year =sc.nextInt();
        String res = Day.findDay(month, day, year);
        System.out.println(res); // Output: WEDNESDAY
    }
}

