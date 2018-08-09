/*
二叉树的深度

题目描述
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class Test38 {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
