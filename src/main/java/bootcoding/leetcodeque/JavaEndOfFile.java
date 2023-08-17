package bootcoding.leetcodeque;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the message");
        int count =0;
        while(s.hasNext()){
            String values = s.nextLine();
            count++;
            System.out.println(count+" "+values);

        }
    }
}
