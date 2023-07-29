package bootcoding.leetcodeque;

public class SameTree100 {
    public static boolean sameTree(TreeNode1 p,TreeNode1 q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.data != q.data) {
            return false;
        }
        boolean res = sameTree(p.left, q.left);
        boolean res1 = sameTree(p.right, q.right);
        return res && res1;
    }
    public static void main(String[] args) {
        TreeNode1 p =new TreeNode1(20);
        TreeNode1 q =new TreeNode1(20);
        p.left =new TreeNode1(30);
        q.left =new TreeNode1(30);
        p.right = new TreeNode1(60);
        q.right =new TreeNode1(80);
        System.out.println(sameTree(p,q));
    }
}
