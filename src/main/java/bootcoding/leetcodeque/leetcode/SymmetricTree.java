package bootcoding.leetcodeque.leetcode;

import bootcoding.leetcodeque.TreeNode1;

public class SymmetricTree {
   public static boolean isSymmetric(TreeNode2 root){
       if(root == null ){
           return true;
       }
       return isMirror(root.left,root.right);
   }
   public  static boolean isMirror(TreeNode2 left,TreeNode2 right){
       if(left == null && right ==null){
           return true;
       }
       if(left== null || right ==null){
           return false;
       }
       return (left.data == right.data) && isMirror(left.left,right.right) &&
       isMirror(left.right,right.left);
   }

    public static void main(String[] args) {
        TreeNode2 root =new TreeNode2(1);
        root.left =new TreeNode2(2);
        root.left.left =new TreeNode2(3);
        root.left.right =new TreeNode2(4);
        root.right =new TreeNode2(2);
        root.right.left =new TreeNode2(4);
        root.right.right =new TreeNode2(3);
        System.out.println(isSymmetric(root));
    }
}