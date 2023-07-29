package bootcoding.leetcodeque;

public class MinDepthOfTree {
    public static int minTravesal(TreeNode1 root) {
            if (root == null) {
                return -1;
            }
            int left = minTravesal(root.left);
            int right = minTravesal(root.right);
            return 1 + Math.min(left, right);
        }

        public static void main (String[]args){
            TreeNode1 root = new TreeNode1(3);
            root.left = new TreeNode1(9);
            root.right = new TreeNode1(20);
            root.right.left = new TreeNode1(18);
            root.right.right =new TreeNode1(7);
            System.out.println(minTravesal(root));
    }
}
