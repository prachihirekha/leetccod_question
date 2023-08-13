package bootcoding.leetcodeque;

public class MaxConsecutiveOne485 {
    public static void main(String[] args) {
        int r[] ={1,0,1,1,0,1,1,1};
        System.out.println(numbers(r));

    }
    public static int numbers(int[] r){
        int count =0;
        int max =0;
        for (int i =0; i<r.length;i++){
            if(r[i] ==1){
                count++;
                max =Math.max(max,count);
            }
            else{
               count =0;
            }
        }
        return max;

    }
}
