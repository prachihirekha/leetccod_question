package bootcoding.leetcodeque;

public class BinarySortTree {
    public static TreeNode1 searchBST(TreeNode1 root, int val) {

            if (root == null) {
                return root;
            }

            if(root.data==val)
            {
                return root;
            }
            if (val < root.data) {
                return searchBST(root.left, val);

            }

            return  searchBST(root.right, val);

        }

    public static void main(String[] args) {

    }
}
