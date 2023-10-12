package bootcoding.leetcodeque;

public class MaxTree {
    public static  int travesal(TreeNode1 root){
        if (root == null){
            return  -1;
        }
        int left =travesal(root.left);
        int right =travesal(root.right);
        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode1 root =new TreeNode1(20);
        root.left=new TreeNode1(30);
        root.right =new TreeNode1(60);
        root.left.left= new TreeNode1(89);
        System.out.println(travesal(root));
    }
}
