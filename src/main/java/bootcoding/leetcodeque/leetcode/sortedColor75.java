package bootcoding.leetcodeque.leetcode;

public class sortedColor75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 2};
        sortColors(nums); // Fixed the method name here
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) { // Fixed the method name here
        int l = 0;
        int i = 0;
        int r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                i++;
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
