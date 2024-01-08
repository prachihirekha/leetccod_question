package bootcoding.basic.question;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the mgs");
        vowels(sc.nextLine());
    }
    public static Boolean vowels(String s){
       return s.toLowerCase().matches(".*[aeiou].*");

    }
}
