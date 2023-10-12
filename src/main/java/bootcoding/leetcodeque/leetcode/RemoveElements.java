package bootcoding.leetcodeque.leetcode;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int i =0;
        for (int j=0;j< nums.length;j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr ={1,0,2,4,5,3,2,2,3};
        int val =2;
        int s=removeElement(arr,val);
        for (int i =0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
