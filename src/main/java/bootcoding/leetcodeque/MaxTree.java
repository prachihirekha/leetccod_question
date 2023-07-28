package bootcoding.leetcodeque;

public class MaxTree {
    public static  int travesal(TreeNode root){
        if (root == null){
            return  -1;
        }
        int left =travesal(root.left);
        int right =travesal(root.right);
        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(20);
        root.left=new TreeNode(30);
        root.right =new TreeNode(60);
        root.left.left= new TreeNode(89);
        System.out.println(travesal(root));
    }
}
