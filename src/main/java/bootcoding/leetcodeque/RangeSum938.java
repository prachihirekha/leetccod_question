package bootcoding.leetcodeque;

public class RangeSum938 {
    public static int rangeSumBST(TreeNode1 root, int low, int high)
    {
        int sum =0;
        if(root ==null){
            return 0;
        }
        if (low <= root.data && root.data <= high) {
            sum += root.data;
        }

        // Recursively check the left and right subtrees
        if (root.data > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.data < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;

    }

//    public static TreeNode1 inorder(TreeNode1 root){
//        while(root.left !=null){
//            root =root.left;
//        }
//        return  root;
//    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(10);
        root.left = new TreeNode1(5);
         root.right = new TreeNode1(15);
         root.left.left = new TreeNode1(3);
         root.left.right = new TreeNode1(7);
         root.right.right = new TreeNode1(18);
         int low =7;
         int high =15;
        int range =rangeSumBST(root,low,high);
        System.out.println(range);
        }
    }


