package bootcoding.leetcodeque;

import static bootcoding.leetcodeque.Insert.insert;

public class DeletingNode {
    public static TreeNode1 deletingNode(TreeNode1 root,int values){
       //search the values
        if(root.data>values){
           root.left =deletingNode(root.left,values);
        } else if (root.data<values) {
            root.right =deletingNode(root.right,values);
        } else{
            if(root.left==null ){
                return root.right;
            }
            if(root.right ==null){
                return  root.left;
            }
            TreeNode1 is  =inorderSeccussor(root.right);
            root.data = is.data;
            root.right =deletingNode(root.right, is.data);

        }
        return root;

    }
    public static TreeNode1 inorderSeccussor(TreeNode1 root){
        while(root.left !=null){
            root =root.left;
        }
        return  root;
    }

    public  static void inOrder(TreeNode1 root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values [] ={5,1,3,4,2,7};
        TreeNode1 root = null;
        for(int i =0;i<values.length;i++){
          //  Insert insert =new Insert();
            root = insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();
        deletingNode(root, 4);
        inOrder(root);
    }

}
