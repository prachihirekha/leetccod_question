package bootcoding.leetcodeque.hackerrank;

import java.util.Scanner;

public class ReverserInHackerrank {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter mgs");
            String A = scanner.next();


            // Reverse the string
            String reversed = new StringBuilder(A).reverse().toString();
            if(A.equals(reversed)){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }

        }
    }


