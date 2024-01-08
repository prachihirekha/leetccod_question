package bootcoding.basic.question;

public class StringContainsVowel {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("hello"));
        System.out.println(stringContainsVowels("tv"));
    }
    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
