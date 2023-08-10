package bootcoding.leetcodeque;

public class TreeNode1 {
    int data;
    TreeNode1 left;
    TreeNode1 right;
    int max;
    TreeNode1 t1;
    TreeNode1 t2;
    public TreeNode1(int data)
    {
        this.data=data;
    }

    public TreeNode1(int data, TreeNode1 left, TreeNode1 right , int max, TreeNode1 t1,TreeNode1 t2)
    {
        this.data=data;
        this.left=left;
        this.right=right;
        this.max=max;
       // this.t1;
    }
}
