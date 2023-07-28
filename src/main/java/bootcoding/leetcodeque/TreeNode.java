package bootcoding.leetcodeque;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    int max;
    public TreeNode(int data)
    {
        this.data=data;
    }

    public TreeNode(int data, TreeNode left, TreeNode right , int max)
    {
        this.data=data;
        this.left=left;
        this.right=right;
        this.max=max;
    }
}
