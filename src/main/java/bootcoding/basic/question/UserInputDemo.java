package bootcoding.basic.question;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        int a,b,c;
        int avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1:");
        // sc. nextint use gfor read statment
        a=sc.nextInt();
        System.out.println("Enter the marks of subject2:");

        b=sc.nextInt();
        System.out.println("Enter the marks of subject3:");
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("enter the avg of three subject is :"+avg);
    }
}
