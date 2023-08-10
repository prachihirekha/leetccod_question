package bootcoding.leetcodeque;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLenght2716 {
    public  static int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
        String s ="aaabc";
        System.out.println(minimizedStringLength(s));
    }
}
