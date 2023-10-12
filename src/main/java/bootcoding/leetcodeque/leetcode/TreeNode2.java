package bootcoding.leetcodeque.leetcode;

public class TreeNode2 {
    //public boolean data;


    int data;
  TreeNode2 left;
   TreeNode2 right;
    int max;
   TreeNode2 t1;
   TreeNode2 t2;
    public TreeNode2(int data)
    {
        this.data=data;
    }

    public TreeNode2(int data,TreeNode2 left,TreeNode2 right , int max, TreeNode2 t1,TreeNode2 t2)
    {
        this.data=data;
        this.left=left;
        this.right=right;
        this.max=max;
        // this.t1;
    }
}


