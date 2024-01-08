package bootcoding.basic.question;

public class ReverseString {
    public static void main(String[] args) {
        String n ="raju";
        char []t =n.toCharArray();
        for (int i = t.length-1;i>=0;i--){
            System.out.println(t[i]);
        }
    }
}
