package bootcoding.leetcodeque;

public class Insert {
    public static TreeNode1 insert(TreeNode1 root, int val){
        if(root == null){
            root  = new TreeNode1((val));
            return  root;
        }
        if(root.data>val){
            root.left =insert(root.left,val);
            return root;
        }
        else {
            root .right =insert(root.right,val);
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
            root =insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();
    }
}


