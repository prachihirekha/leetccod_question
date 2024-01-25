package bootcoding.basic.question;

public class CountString {
    public static void main(String[] args) {
        String c ="Theis is the window application";
        int count =0;

        for(int i =0;i<c.length();i++){
//            if(c.charAt(i)!=' '){
                count++;
//            }
        }
        System.out.println("count of the string :" +count);
    }
}
