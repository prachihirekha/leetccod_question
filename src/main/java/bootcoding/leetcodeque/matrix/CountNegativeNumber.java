package bootcoding.leetcodeque.matrix;

public class CountNegativeNumber {
    public  static  int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int r = n - 1;
        int c = 0;
        int sum = 0;
        while (r >= 0 && c < m) {
            if (grid[r][c] < 0) {
                r--;
                sum += m - c;
            } else {
                c++;
            }
        }
            return sum;
        }

    public static void main(String[] args) {
        int[][] mat = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(mat) + "  Negative Count of Numbers");
    }
}
