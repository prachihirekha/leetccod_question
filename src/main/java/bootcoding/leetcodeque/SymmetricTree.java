package bootcoding.leetcodeque;

public class SymmetricTree {
   public static boolean isSymmetric(TreeNode1 root){
       if(root == null ){
           return true;
       }
       return isMirror(root.left,root.right);
   }
   public  static boolean isMirror(TreeNode1 left,TreeNode1 right){
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
        TreeNode1 root =new TreeNode1(1);
        root.left =new TreeNode1(2);
        root.left.left =new TreeNode1(3);
        root.left.right =new TreeNode1(4);
        root.right =new TreeNode1(2);
        root.right.left =new TreeNode1(4);
        root.right.right =new TreeNode1(3);
        System.out.println(isSymmetric(root));
    }
}