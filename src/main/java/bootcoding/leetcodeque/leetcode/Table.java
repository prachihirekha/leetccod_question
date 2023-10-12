package bootcoding.leetcodeque.leetcode;


public class Table {
    public static void main(String[] args) {

    }

    public static class DeletingNode {
        public static TreeNode2 deletingNode(TreeNode2 root, int values){
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
                TreeNode2 is  =inorderSeccussor(root.right);
                root.data = is.data;
                root.right =deletingNode(root.right, is.data);

            }
            return root;

        }
        public static TreeNode2 inorderSeccussor(TreeNode2 root){
            while(root.left !=null){
                root =root.left;
            }
            return  root;
        }

        public  static void inOrder(TreeNode2 root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

//        public static void main(String[] args) {
//            int values [] ={5,1,3,4,2,7};
//            TreeNode2 root = null;
//            for(int i =0;i<values.length;i++){
//              //  Insert insert =new Insert();
//                root =insert(root,values[i]);
//            }
//            inOrder(root);
//            System.out.println();
//            deletingNode(root, 4);
//            inOrder(root);
//        }

    }
}
