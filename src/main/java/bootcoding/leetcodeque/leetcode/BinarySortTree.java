package bootcoding.leetcodeque.leetcode;

import bootcoding.leetcodeque.TreeNode1;

public class BinarySortTree {
    public static TreeNode2 searchBST(TreeNode2 root, int val) {

        if (root == null) {
            return root;
        }

        if (root.data == val) {
            return root;
        }
        if (val < root.data) {
            return searchBST(root.left, val);

        }

        return searchBST(root.right, val);

    }

    public static void main(String[] args) {

    }
}


